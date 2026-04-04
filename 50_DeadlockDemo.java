public class DeadlockDemo {
    public static void main(String[] args) {
        String r1 = "Res1", r2 = "Res2";
        new Thread(() -> {
            synchronized(r1) {
                System.out.println("T1 locked R1");
                synchronized(r2) { System.out.println("T1 locked R2"); }
            }
        }).start();
        new Thread(() -> {
            synchronized(r2) { // To prevent, use synchronized(r1) here too
                System.out.println("T2 locked R2");
                synchronized(r1) { System.out.println("T2 locked R1"); }
            }
        }).start();
    }
}
