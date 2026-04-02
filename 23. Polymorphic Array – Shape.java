// 23. Create a polymorphic array of 'Shape' objects calling 'draw()'.

class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing Square");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];

        shapes[0] = new Circle();
        shapes[1] = new Square();

        for (Shape s : shapes) {
            s.draw();
        }
    }
}
