public class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> System.out.println("Thread working..."));
        t.start();
        t.join(); // Waits for t to finish
        System.out.println("Thread finished, Main continuing.");
    }
}
