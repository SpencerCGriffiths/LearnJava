package FindValueGreater;


public class FindValueGreater { 
    public static int findValuesGreaterThan(int[][] arr2D, int num) {
        // Add your code below
        int counter = 0; 

        for (int[] i : arr2D) {
            for (int j : i) {
                if ( j > num) { 
                    counter++;
                }
            }
        }
        return counter; 
      }
    
      public static void main(String[] args) {
    
        int[][] koalaSpottings = {{17, 13, 19, 22}, {12, 18, 25, 20}, {15, 18, 21, 24}, {19, 23, 23, 22}, {18, 20, 21, 26}};
        System.out.println(findValuesGreaterThan(koalaSpottings, 20));
      }
}

// The researchers want to know the number of times they spotted more than 20 koalas in a day. 