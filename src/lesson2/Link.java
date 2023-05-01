package lesson2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Link {

    public static void main(String[] args) {
        String str2 = new String("My name is Earl");
        String str3 = new String("I love Java");

        List<String> list = Arrays.asList("Hello World!","I live in Moscow","I came from LA");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addAll(list);

        linkedList.add(str3);
        linkedList.add(1,str2);
        linkedList.add(4,"BAD eRRoe");

        System.out.println(linkedList);

        System.out.println("at index 3 - " + linkedList.get(3));
        System.out.println("at first - " + linkedList.getFirst());

        System.out.println(linkedList.indexOf("BAD eRRoe") + " is the index of BAD eRRoe");
        System.out.println("list contains I lo Java? " + linkedList.contains("I lo Java"));

        linkedList.remove("BAD eRRoe");
        linkedList.clear();

        System.out.println(linkedList);
    }
}