package lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        Integer[] keys = new Integer[]{12,33,542,2456,42,4};

        ArrayList<Integer> list = new ArrayList<>(List.of(keys));

        list.add(999);
        list.add(0,777);

        System.out.println(list);

        System.out.println("5 index is - "+list.get(5));
        System.out.println("contains list 777? "+list.contains(777));
        System.out.println("indexOf(33) - " + list.indexOf(33));
        System.out.println("size - " +list.size());


        list.clear();
        System.out.println(list.isEmpty());
    }
}
