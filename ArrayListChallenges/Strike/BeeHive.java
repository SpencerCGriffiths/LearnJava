package ArrayListChallenges.Strike;
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

  public void renameBees(ArrayList<String> newNames) {

    int numNamesToAssign = this.beeList.size();
    if (newNames.size() < this.beeList.size()) {
      numNamesToAssign = newNames.size();
    }

    for (int i = 0; i < numNamesToAssign; i++) {
      this.beeList.get(i).setName(newNames.get(i));
    }
  }

  public static void main(String[] args) {
    BeeHive myHive = new BeeHive(3);
    ArrayList<String> newNames = new ArrayList<String>();
    newNames.add("bob");
    newNames.add("macey");
    newNames.add("anna");

    myHive.renameBees(newNames);
   
    // Print out the elements in the bee list to make sure the new bees were added
    for (Bee b : myHive.beeList) {
      System.out.println(b.getName());
    }
  }
}

// - Our bees are going on strike, and they demand new names! Given an ArrayList of newNames in .renameBees(), update each bee’s name to a name in the ArrayList at the corresponding index.
// .setName()

// - For example, say we have the following names: {“jamie”, “alex”, “jeremy”}. The bee should index 0 should get the name “jamie”. The second bee should get the name “alex” and the third bee should get the name “jeremy”.

// - If there are not enough names for every bee in the beeList, then you don’t have to update the names for the remaining bees. (We can talk to them to work out a compromise).
