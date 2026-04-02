// 27. Implement constructor overloading in a 'Box' class.

class Box {
    int length, width;

    Box() {
        length = 0;
        width = 0;
    }

    Box(int l, int w) {
        length = l;
        width = w;
    }

    void display() {
        System.out.println("Length: " + length + ", Width: " + width);
    }
}

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(10, 5);

        b1.display();
        b2.display();
    }
}
