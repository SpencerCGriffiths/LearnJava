package FibonacciMemoization;
import java.util.HashMap;
import java.util.Map;

public class fibMemo {

  public static void main(String[] args) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    System.out.println(fibMemo(10, map));

    map = new HashMap<Integer, Integer>();
    System.out.println(fibMemo(20, map));
  }

  public static int fibMemo(int n, Map<Integer, Integer> map) {
    if(n == 0 || n == 1) { 
      map.put(n, n); // Initializing base case for Fibonacci of 0
      map.put(n, n); // Initializing base case for Fibonacci of 1  
    }

    if (map.containsKey(n)) {
        // If the value is already computed, return it from the map to save computation
        return map.get(n);
    } else {
        // Compute the value for n by recursively calling fibMemo for n-1 and n-2
        int value = fibMemo(n - 1, map) + fibMemo(n - 2, map);
        // Store the computed value in map before returning
        map.put(n, value);
        return value;
    }
  }
}

// fibMemo(n, map)
//   if n is 0 or 1
//     return n
//   if n key exists in map
//     return map.get(n)
//   else
//     calculate current fibonacci number through a recursive call
//     store value in map
//     return value

// .containsKey(key) 
// - takes key as an argument and returns true or false depending on if the key is present in the HashMap
// .replace(key, newVal)
// - takes the key and new value and replaces value at that key with the new value input
// .keySet()
// - returns a Set containing all the key values in the HashMap
// .values()
// - returns a Collection containing all the values (without their keys)
// .put(key, value); 
// - Adds to the map
// .containsKey(key); 
// - Returns true or false
// .get(key); 
// - Returns the corresponding value