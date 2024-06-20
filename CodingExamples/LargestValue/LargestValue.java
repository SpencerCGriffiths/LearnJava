package LargestValue;

public class LargestValue {
    public static int largestColumn(int[][] arr2D) {
        // Add your code below

        int currentColumn = 0; 
        int largestColumn = 0; 
        int indexOfColumn = 0;

        for (int i = 0; i < arr2D[0].length; i++) {
            for (int j = 0; j < arr2D.length; j++) {
                currentColumn += arr2D[j][i];
            }
            if(currentColumn > largestColumn) { 
                largestColumn = currentColumn;
                indexOfColumn = i; 
            }
        }
        return indexOfColumn;
      }
    
      public static void main(String[] args) {
    
        int[][] koalaSpottings = {{17, 13, 19, 22}, {12, 18, 25, 20}, {15, 18, 21, 24}, {19, 23, 23, 22}, {18, 20, 21, 26}};
        System.out.println(largestColumn(koalaSpottings));
      }
}
