// 18. Implement hierarchical inheritance: 'Shape' > 'Circle', 'Square'.
class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape {
    void drawSquare() {
        System.out.println("Drawing Square");
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        Square s = new Square();

        c.display();
        c.drawCircle();

        s.display();
        s.drawSquare();
    }
}
