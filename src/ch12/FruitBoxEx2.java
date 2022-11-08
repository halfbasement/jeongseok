package ch12;


import javax.swing.*;
import java.util.ArrayList;

class Fruit implements Eatable{
    @Override
    public String toString() {
        return "Fruit";
    }
}


class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit {
    @Override
    public String toString() {
        return "Grape";
    }
}

class Toy {
    @Override
    public String toString() {
        return "Toy";
    }
}

interface Eatable{}

public class FruitBoxEx2 {
    public static void main(String[] args) {

    }
}


class FruitBox<T extends Fruit & Eatable> extends Box<T>{}

class Box<T>{
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) {list.add(item);}
    T get(int i) {return list.get(i);}
    int size() {return list.size();}
    public String toString() {return list.toString();}
}