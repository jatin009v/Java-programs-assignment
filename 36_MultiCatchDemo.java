public class MultiCatchDemo {
    public static void main(String[] args) {
        try {
            int[] a = new int[5];
            a[10] = 30 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("Math error occurred");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error occurred");
        }
    }
}
