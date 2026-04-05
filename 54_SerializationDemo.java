import java.io.*;

class Student implements Serializable { String name = "Jatin"; }

public class SerializationDemo {
    public static void main(String[] args) throws Exception {
        // Serialize
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("obj.txt"));
        out.writeObject(new Student());
        // Deserialize
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("obj.txt"));
        Student s = (Student) in.readObject();
        System.out.println("Deserialized Name: " + s.name);
    }
}
