package Java_Program;
import java.util.Set;
import java.util.TreeSet;

public class UniqueElement {
  public static void main(String[] args) {
    
    Set<Integer> t = new TreeSet<Integer>();
 
    t.add(11);
    t.add(10);
    t.add(5);
    t.add(45);
    t.add(11);

    System.out.println(t);

  }
}
