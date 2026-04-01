// 19. Override 'toString()' in a 'Person' class and its child Student' class.

class Person {

    String name;

    Person(String name) {
        this.name = name;
    }

    public String toString() {
        return "Person Name: " + name;
    }
}

class Student extends Person {
    int roll;

    Student(String name, int roll) {
        super(name);
        this.roll = roll;
    }

    public String toString() {
        return "Student Name: " + name + ", Roll No: " + roll;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Jatin");
        Student s = new Student("Rahul", 101);

        System.out.println(p);
        System.out.println(s);
    }
}
