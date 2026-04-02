// 25. Override equals() and hashCode()' in a 'Person' class.

import java.util.Objects;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;

        Person p = (Person) obj;
        return age == p.age && name.equals(p.name);
    }

    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Jatin", 20);
        Person p2 = new Person("Jatin", 20);

        System.out.println(p1.equals(p2));
    }
}
