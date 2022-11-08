package ch12;

class Fruit {
    String name;
    int weight;

    public Fruit(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " ( " + weight + " ) ";
    }
}


class Apple extends  Fruit {
    public Apple(String name, int weight) {
        super(name, weight);
    }
}

class Grape extends  Fruit {

    public Grape(String name, int weight) {
        super(name, weight);
    }
}


class AppleComp implements Comparable<Apple>{
    @Override
    public int compareTo(Apple t1 , Apple t2) {
        return 0;
    }
}

public class FruitBox4 {

}
