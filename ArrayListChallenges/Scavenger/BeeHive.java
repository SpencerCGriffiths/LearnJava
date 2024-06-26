package ArrayListChallenges.Scavenger;
import java.util.ArrayList;

public class BeeHive {
  private ArrayList<Bee> beeList;

  public BeeHive(int numBees) {
    this.beeList = new ArrayList<Bee>();
    for (int i = 0; i < numBees; i++) {
      this.beeList.add(new Bee("bee" + i));
    }
  }

  public ArrayList<Bee> getBeeList() {
    return this.beeList;
  }

  public void leaveHome(String beeName) {
        for (Bee bee : beeList) {
            if(beeName.equals(bee.getName()) ) { 
                bee.leaveHome();
            }
        }
  }

  public static void main(String[] args) {
    BeeHive myHive = new BeeHive(365);
    myHive.leaveHome("bee43");

    // Print bee's status to make sure it is no longer home
    System.out.println(myHive.beeList.get(43).isHome());
  }
}