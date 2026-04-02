// 26. Create a class with default and parameterized constructors.

class Student {
    String name;

    Student() {
        name = "Default Name";
    }

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Jatin");

        s1.display();
        s2.display();
    }
}
