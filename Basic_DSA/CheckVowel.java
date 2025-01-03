package Basic_DSA;

import java.util.HashMap;
import java.util.Map;

public class CheckVowel {
  public static void main(String[] args) {
    // Map to store the frequency of vowels
    Map<Character, Integer> m = new HashMap<>();

    String str = "hello user welcome to java";

    // Loop through each character in the string
    for (char x : str.toCharArray()) {
      // Check if the character is a vowel
      if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
        // If the vowel is already in the map, increment its count
        if (m.containsKey(x)) {
          m.put(x, m.get(x) + 1);
        } else {
          // If the vowel is not in the map, add it with a count of 1
          m.put(x, 1);
        }
      }
    }

    // Print the map with the frequency of vowels
    System.out.println(m);
  }
}
