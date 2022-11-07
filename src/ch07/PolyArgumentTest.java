package ch07;

class Product{
    int price;
    int bonusPoint;

    public Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv extends Product {
    Tv(){
        super(100);
    }

    @Override
    public String toString() {
        return "Tv";
    }
}

class Computer extends Product{
    public Computer() {
        super(200);
    }

    @Override
    public String toString() {
        return "computer";
    }
}

class Buyer{
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p){
        if(money < p.price){
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p+"를 구입했습니다");
    }
}


public class PolyArgumentTest {

}
