// 11. Create an abstract class 'Shape' with abstract method `area()'. Implement `Circle' and 'Rectangle' classes.

    abstract class Shape {
    abstract void area(); // No body here
}

class Circle extends Shape {
    void area() {
        double r = 5;
        System.out.println("Circle Area: " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {
    void area() {
        int l = 10, b = 5;
        System.out.println("Rectangle Area: " + (l * b));
    }
}
