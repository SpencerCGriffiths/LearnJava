package ReverseGroceries;

import java.util.Arrays;
import java.util.Collections;

public class ReverseGroceries {
    public static void reverseGroceries(String[] groceryList) {

        Collections.reverse(Arrays.asList(groceryList)); 
        for (String string : groceryList) {
            System.out.println(string);
        }

    }
  
  
    public static void main(String[] args) {
      // Below is a sample test case you can use to run your code.
      // Try playing around with different values in the array to test edge cases
      String[] groceryList = {"apples", "banana", "Apples", "chocolate"};
      reverseGroceries(groceryList);
  
      for (String item : groceryList) {
        System.out.println(item);
      }
    }
}
