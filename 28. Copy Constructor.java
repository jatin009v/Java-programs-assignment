// 28. Write a program demonstrating copy constructor.

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    // Copy constructor
    Student(Student s) {
        this.name = s.name;
    }

    void display() {
        System.out.println(name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Jatin");
        Student s2 = new Student(s1);

        s2.display();
    }
}
