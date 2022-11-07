package ch06;

public class Recursive {

    public static void main(String[] args) {


        Recursive.method(5);


    }

    static void method(int n){
        if (n==0)
            return;
        System.out.println(n);
        method(--n);
    }
}
