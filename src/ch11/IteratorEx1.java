package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx1 {
    public static void main(String[] args) {

        ArrayList<Object> objects = new ArrayList<>();

        objects.add(1);
        objects.add(2);
        objects.add(3);
        objects.add(4);
        objects.add(5);

        Iterator<Object> iterator = objects.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println("next = " + next);
        }

    }
}
