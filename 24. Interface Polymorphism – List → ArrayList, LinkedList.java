// 24. Implement interface polymorphism with List' > ArrayList', 'LinkedList'.

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> list;

        list = new ArrayList<>();
        list.add("ArrayList Item");

        list = new LinkedList<>();
        list.add("LinkedList Item");

        for (String item : list) {
            System.out.println(item);
        }
    }
}
