// 30. Show constructor chaining using 'this()'.

class Demo {

    Demo() {
        this(10);
        System.out.println("Default Constructor");
    }

    Demo(int x) {
        System.out.println("Parameterized Constructor: " + x);
    }
}

public class Main {
    public static void main(String[] args) {
        new Demo();
    }
}
