package BurritoCalculator2;

public class BurritoCalculator2 {
    public static int getBurritosSold(int lastOrderNumber) {
      int totalBurritosSold = 0;
        for (int i = 0; i < lastOrderNumber; i++) {
            totalBurritosSold += i; 
        }

      return totalBurritosSold;
    }
      
    public static void main(String []args) {
      // Try testing your code with different arguments in the method call
      System.out.println(getBurritosSold(548));
    }
  }
  

/*Each customer’s order number coincidentally corresponded with the number of burritos they ordered. For example, the first customer of the day had order number 0 and ordered 0 burritos, since they only ordered water. The second customer of the day had order number 1 and ordered 1 burrito, and the last customer of the day had order number 548 and ordered 548 burritos.

Update the .getBurritosSold() method to calculate the total number of burritos sold, and store it in the totalBurritosSold variable. */