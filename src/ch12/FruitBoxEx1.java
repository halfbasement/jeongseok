package ch12;

import java.util.ArrayList;

public class FruitBoxEx1 {

}

class Box<T>{
    ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

}