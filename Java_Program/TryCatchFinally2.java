package Java_Program;

public class TryCatchFinally2 {
    @SuppressWarnings("UseSpecificCatch")
    public static void getInteger() {
        try {
           throw new  ArithmeticException("Division by zero not allowed");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
           System.out.println("Finally Block");
        }
    }

    public static void main(String[] args) {
        getInteger();
    }
}
