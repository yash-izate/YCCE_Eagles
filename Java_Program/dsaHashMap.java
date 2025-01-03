package Java_Program;

import java.util.HashMap;
import java.util.Map;

public class dsaHashMap {
  public static void main(String[] args) {
    // HashMap with generics for type safety
    Map<String, String> m = new HashMap<>();

    m.put("rahul", "bmw");
    m.put("rohit", "audi");
    m.put("alok", "skoda");

    // Using lambda to iterate over the map
    m.forEach((k, v) -> {
      System.out.println(k + " has " + v);
    });
  }
}
