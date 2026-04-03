public class DivisionDemo {
    public static void main(String[] args) {
        try {
            int res = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
    }
}
