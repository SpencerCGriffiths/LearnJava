package GroceryList2;

public class GroceryList2 {
        public static Object[] getMostExpensiveItemCost(double[] groceryPrices) {
          // We can set the maxCost initially to the first item without an IndexOutOfBounds error because we can assume there is at least one item in the array.
          double maxCost = groceryPrices[0];

          double cheapestCost = groceryPrices[0];

          double maxCombinedCost = 0.0;

          int indexOfItemToLeave = 0; 

          for(int i = 0; i < groceryPrices.length; i++) { 
            if(maxCost < groceryPrices[i]) { 
                maxCost = groceryPrices[i];
            } else if (cheapestCost > groceryPrices[i]) { 
                cheapestCost = groceryPrices[i];
            }
          }
          Object[] result = new Object[]{maxCost, cheapestCost};
          return result;
        }
      
        public static void main(String[] args) {
          // Below is a sample test case you can use to run your code.
          // Try playing around with different values in the array to test edge cases
         double[] groceryPrices = {10.0, 12.3, 8.45, 2.34};
         Object[] result = getMostExpensiveItemCost(groceryPrices);
         for (int i = 0;  i < result.length; i++) {
            System.out.println(result[i]);            
         }
        }
      
}

// 1- Oh no! You spent most of your money on burritos, which puts you over budget given all of the groceries on the list.

// All the items in the grocery list cost a total of $33.09, but you only have $31.89. Given that every item in the list costs at least $1.20 and there is at least one item in the list, you can remove one item to stay within your budget. Update the .getMostExpensiveItemCost() method to find the most expensive item in the array of groceryPrices, and return the item.

// double maxCost = groceryPrices[0];
          
// for(int i = 0; i < groceryPrices.length; i++) { 
//   if(maxCost < groceryPrices[i]) { 
//       maxCost = groceryPrices[i];
//   }
// }
// return maxCost;

// 2- Extra challenge
// How would you modify your solution to return the cheapest item in the array of groceryPrices?

// double maxCost = groceryPrices[0];
          
// double cheapestCost = groceryPrices[0];

// for(int i = 0; i < groceryPrices.length; i++) { 
//   if(maxCost < groceryPrices[i]) { 
//       maxCost = groceryPrices[i];
//   } else if (cheapestCost > groceryPrices[i]) { 
//       cheapestCost = groceryPrices[i];
//   }
// }
// double[] result = new double[]{maxCost, cheapestCost};
// return result;
// }

// public static void main(String[] args) {
// // Below is a sample test case you can use to run your code.
// // Try playing around with different values in the array to test edge cases
// double[] groceryPrices = {10.0, 12.3, 8.45, 2.34};
// double[] result = getMostExpensiveItemCost(groceryPrices);
// for (double d : result) {
//   System.out.println(d);            
// }
// }


// Hint
// Super extra challenge:
// Now, let’s assume that each item costs at least $0.00. How would you modify your solution to return the cost of the item that, when removed, allows you to spend the most money? (Remember, the total should still stay within the limits of your budget.)

