class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        int age = 15;
        try {
            if (age < 18) throw new InvalidAgeException("Not eligible to vote");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
