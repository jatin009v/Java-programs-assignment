// 13. Create an interface 'Drawable' with method `draw()'. Implement it in `Circle' and 'Square' classes.

interface Drawable {
    void draw(); 
}

class CircleShape implements Drawable {
    public void draw() {
        System.out.println("Drawing a Circle...");
    }
}

class Square implements Drawable {
    public void draw() {
        System.out.println("Drawing a Square...");
    }
}
