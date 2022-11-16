package ch12;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Fruit {
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

class Grape extends Fruit{


    @Override
    public String toString() {
        return "grape";
    }
}

class Juice{
    String name;

    public Juice(String name) {
        this.name = name + "쥬스";
    }

    @Override
    public String toString() {
        return name;
    }
}

class Juicer{
    static Juice makeJuice(FruitBox<? extends Fruit> box){
        String tmp ="";

        for (Fruit f : box.getList())
            tmp += f + " ";
        return new Juice(tmp);
    }
}

public class FruitBoxEx3{

    public static void main(String[] args) {

        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBOx = new FruitBox<Apple>();

        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBOx.add(new Apple());
        appleBOx.add(new Apple());


        System.out.println(Juicer.makeJuice(appleBOx));
    }
}

class FruitBox<T extends Fruit> extends Box<T>{}

class Box<T>{
    ArrayList<T> list = new ArrayList<>();
    void add (T item) { list.add(item);}
    T get(int i){return list.get(i);}
    ArrayList<T> getList() {return list;}
    int size() {return list.size();}
    public String toString(){return list.toString();}
}
