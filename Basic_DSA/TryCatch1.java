
public class TryCatch1 {

    public static void getInteger() {
        int a = Integer.parseInt("abc");
        System.out.println("a = " + a);
    }

    public static void main(String[] args) {
        try {
            getInteger();
        } catch (Exception e) {
            System.out.println("Enter number only");
        } finally {
            System.out.println("Always get executed"); 
        }
    }

}
