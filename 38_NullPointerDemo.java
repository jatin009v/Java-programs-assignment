public class NullPointerDemo {
    public static void main(String[] args) {
        try {
            String str = null;
            if (str == null) throw new NullPointerException("String is null!");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
