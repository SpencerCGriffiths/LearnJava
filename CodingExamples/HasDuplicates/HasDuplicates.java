package HasDuplicates;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;

public class HasDuplicates {
    public static boolean hasDuplicates(String[] groceryList) {

        // sort the groceryList for easier comparison and lower data usage
        // Collator.getInstance() <- makes sort case insensitive 
        Arrays.sort(groceryList, Collator.getInstance());     

        // Now convert string into ArrayList so we can remove and add easily
        ArrayList<String> groceryArrList = new ArrayList<String>( 
            Arrays.asList(groceryList)); 
  
        // Now iterate checking each against prior
      for (int i = 1; i < groceryArrList.size(); i++) {
        if(groceryArrList.get(i).equalsIgnoreCase(groceryArrList.get(i - 1))) { 
            groceryArrList.remove(i); 
              i--;
            }
      }

        // Now turn it in to an array 
        groceryArrList.toArray(); 

        // 
        for (String string : groceryArrList) {
          System.out.println(string);
        }


        return false;
      }
    
      public static void main(String[] args) {
        // Below is a sample test case you can use to run your code.
        // Try playing around with different values in the array to test edge cases
        String[] groceryList = {"apples", "banana", "Apples", "chocolate", "Cheese", "CHeEsE"};
        System.out.println(hasDuplicates(groceryList));
      }
}

//remove duplicates from the array