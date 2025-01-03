package Basic_DSA;
import java.util.ArrayList;

public class ArrayListExp {
  public static void main(String[] args) {
    
    // Arraylist: Dynamic Array Size
    
    ArrayList<Integer> t = new ArrayList<Integer>();

    t.add(11);
    t.add(13);
    t.add(15);
    t.add(2);
    t.set(0,5);

    System.out.println(t);
  }
  
}
