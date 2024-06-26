package ArrayListChallenges.PrintBee;

import java.util.ArrayList;

public class BeeHive {
  private ArrayList<Bee> beeList;

  public BeeHive(int numBees) {
    this.beeList = new ArrayList<Bee>();

    for (int i = 0; i < numBees; i++) {
      this.beeList.add(new Bee("bee" + i));
    }
  }

  public void printBees() {
    for (Bee bee : beeList) {
        System.out.println(bee.getName());
    }
  }

  public static void main(String[] args) {
    BeeHive myHive = new BeeHive(365);
    myHive.printBees();
  }
}