package ch07.prac;

class SutdaDeck {
    final int CARD_NUM = 20;

}
class SutdaCard{
    int num;
    boolean isKwang;

    public SutdaCard() {
        this(1,true);
    }

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    @Override
    public String toString() {
        return num+(isKwang ?"K":"");
    }
}

public class Exercise7_1 {

    public static void main(String[] args) {
    }
}
