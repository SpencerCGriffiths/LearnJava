package Arrays2DExamples.KoalaCounting;

public class KoalaCounting {
    public static int getTotal(int[] arr) {
        // Add your code below
        int result = 0; 
        for (int i : arr) {
          result += i; 
        }
        return result; 
      }
    
      public static void main(String[] args) {
        int[] dayOne = {17, 13, 19, 22};
        System.out.println(getTotal(dayOne));
      }
    
}
