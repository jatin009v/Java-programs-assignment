import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for(int i=1; i<=3; i++) {
            int task = i;
            executor.execute(() -> System.out.println("Task " + task + " by " + Thread.currentThread().getName()));
        }
        executor.shutdown();
    }
}
