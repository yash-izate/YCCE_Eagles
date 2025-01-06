package Java_Program;

class CustomExceptionUser extends Exception {

    public CustomExceptionUser(String message) {
        super(message);
    }

}

public class CustomException {

    public static void main(String[] args) {

        try {
            throw new CustomExceptionUser("Exception");
        } catch (CustomExceptionUser e) {
            System.out.println("Caught: " + e.getMessage());
        }

    }

}
