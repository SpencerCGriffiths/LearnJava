package BurritoCalculator;

public class BurritoCalculator {
  public static boolean hasLeftoverFunds(int burritoCost) {
    int budget = 100;
    int numBurritos = 0;
    
    while (budget >= burritoCost) {
      numBurritos++;
      budget -= burritoCost;
    }


    System.out.println("Remaining budget: " + budget);

    if (budget == 0) { 
     return false; 
    } else { 
      return true;
    }

  }
    
  public static void main(String []args) {
 
    System.out.println(hasLeftoverFunds(7));
    System.out.println(hasLeftoverFunds(10));
  }
}
