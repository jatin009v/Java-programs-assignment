class Buffer {
    boolean hasData = false;
    synchronized void produce() throws InterruptedException {
        if(hasData) wait();
        System.out.println("Produced");
        hasData = true; notify();
    }
    synchronized void consume() throws InterruptedException {
        if(!hasData) wait();
        System.out.println("Consumed");
        hasData = false; notify();
    }
}
public class ProducerConsumer {
    public static void main(String[] args) {
        Buffer b = new Buffer();
        new Thread(() -> { try { b.produce(); } catch(Exception e){} }).start();
        new Thread(() -> { try { b.consume(); } catch(Exception e){} }).start();
    }
}
