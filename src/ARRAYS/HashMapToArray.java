package ARRAYS;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapToArray {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Transfer keys to an array
        Integer[] keysArray = map.keySet().toArray(new Integer[0]);

        // Print the array
        System.out.println("Keys Array: " + Arrays.toString(keysArray));
    }
}
