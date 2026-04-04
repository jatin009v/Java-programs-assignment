public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            while(true) System.out.println("Background task...");
        });
        t.setDaemon(true);
        t.start();
        System.out.println("Main thread ends, Daemon will stop.");
    }
}
