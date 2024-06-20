package isAlphabetised;

import java.util.Arrays;

public class isAlphabetized { 

public static boolean isAlphabetized(String[] groceryList) {

  for (String string : groceryList) {
    System.out.println(string);        
  }
      Arrays.sort(groceryList); 
      for (String string : groceryList) {
        System.out.println(string);        
      }
      return true;
    }
  
    public static void main(String[] args) {
      // Below is a sample test case you can use to run your code.
      // Try playing around with different values in the array to test edge cases
      String[] groceryList = {"apples", "banana", "chocolate", "abbles", "bananas"};
      System.out.println(isAlphabetized(groceryList));
    }
}

// alphabitise the list of items (spaces come before any alphaetical letter)
