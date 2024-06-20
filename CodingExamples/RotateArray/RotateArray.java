package RotateArray;

public class RotateArray {
    public static void rotateGroceries(String[] groceryList) {
        String temp = groceryList[groceryList.length - 1];
        for (int i = groceryList.length - 1; i >= 0; i--) {
            if(i == 0) { 
                groceryList[i] = temp;
            } else { 
                groceryList[i] = groceryList[i - 1]; 
            }
        }
    }
  
    public static void main(String[] args) {
      // Below is a sample test case you can use to run your code.
      // Try playing around with different values in the array to test edge cases
      String[] groceryList = {"apples", "banana", "Apples", "chocolate"};
      rotateGroceries(groceryList);
  
      for (String item : groceryList) {
        System.out.println(item);
      }
    }
}


// The last item should be the first. 
// The first item will become the second etc. 
