package Java_Program;

import java.util.HashMap;
import java.util.Map;

public class StringOccurances {
  public static void main(String[] args) {
    Map m = new HashMap();

    String str = "hello user welcome to java";

    for (char x : str.toCharArray()) {
      if (m.containsKey(x)) {
        int old = (int) m.get(x);
        m.put(x, old + 1);
      } else {
        m.put(x, 1);
      }
    }

    System.out.println();
  }

}
