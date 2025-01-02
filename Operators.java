public class Operators {
  public static void main(String[] args) {
    
    int a = 1;
    int b = a>>1;

    System.out.println(b);

    int c = 11;
    int d = 12;

    System.out.println(c | d);
    System.out.println(c & d);

    int e = ++a;
    System.out.println(a);
    System.out.println(e);

    int z = 1;
    int f = z++;
    System.out.println(z);
    System.out.println(f);

    int p = 1;
    int q = p++ + p++;
    System.out.println(p);
    System.out.println(q);
    
  }
}
