// 14. Design a 'Student' class with encapsulation (private fields, getters/setters).

class Student {
    private String name;
    private int age;

    // Setter methods
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

    // Getter methods
    public String getName() { return name; }
    public int getAge() { return age; }
}
