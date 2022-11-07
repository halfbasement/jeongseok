package ch07;

interface I{
    void play();
}

class B implements I{
    @Override
    public void play() {
        System.out.println("b입니다");
    }
}

class C implements I{
    @Override
    public void play() {
        System.out.println("C입니다");
    }
}


class A {
    void autoPlay(I i){
        i.play();
    }
}

public class BasicInterface {

    public static void main(String[] args) {

        A a = new A();
        a.autoPlay(new C());

    }
}
