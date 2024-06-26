package ArrayListChallenges.MovingOut;
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

  public void moveOutBees() {
    for (int i = 0; i < beeList.size() - 1; i++) {
        if (i % 2 != 0 || i == 0) { 
            beeList.remove(i);
        }
    }
  }

  public static void main(String[] args) {
    BeeHive myHive = new BeeHive(365);
    myHive.moveOutBees();
   
    // Print out the elements in the bee list to make sure the new bees were removed
    for(Bee b : myHive.beeList){
      System.out.println(b.getName());
    }
  }
}