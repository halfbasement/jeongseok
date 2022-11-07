package ch07;

public class InstanceofTest {
    public static void main(String[] args) {

        FireEngine fe = new FireEngine();

        if(fe instanceof FireEngine){
            System.out.println("fe는 파이어엔진의 인스턴스입니다");
        }


    }
}

class Car {}
class FireEngine extends Car {}
