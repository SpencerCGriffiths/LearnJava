package HasSpecialItem;

public class HasSpecialItem {
        public static boolean hasSpecialItem(double[] groceryPrices) {
      

        for (double e : groceryPrices) {
            
            double decimal = e - Math.floor(e);
            System.out.println(decimal);
            if (decimal == .99) { 
                System.out.println(decimal);
            }
        }
      
          return false;
        }
      
        public static void main(String[] args) {
          // Below is a sample test case you can use to run your code.
          // Try playing around with different values in the array to test edge cases
          double[] groceryList = {10.0, 89.9, 8.99, 2.34};
          System.out.println(hasSpecialItem(groceryList));
        }
}
