package ch11;

import java.util.PrimitiveIterator;
import java.util.Stack;

public class StackEx1 {

    public static Stack back = new Stack();
    public static Stack forward = new Stack();

    public static void main(String[] args) {


        goURL("1.페이스북");
        goURL("2.인스타그램");
        goURL("3.카카오스토리");
        goURL("4.트위터");

        printStatus();//트위터입니다

        goBack();
        System.out.println("==뒤로가기 누른 뒤==");
        printStatus(); //카스입니다

        goBack();
        System.out.println("==뒤로가기 누른 뒤==");
        printStatus(); // 인스타그램입니다

        goForward();
        System.out.println("==앞으로가기 누른 뒤==");//카승비니다
        printStatus();

        goURL("새로운 주소 네이버");
        System.out.println("==새로운 주소로 이동 후==");
        printStatus();//섹스.COM
    }


    public static void printStatus(){
        System.out.println("back :" +back);
        System.out.println("forward :"+forward);
        System.out.println("현재화면은 '" + back.peek() +"'입니다.");
    }

    public static void goURL(String url){
        back.push(url);
        if(!forward.empty())
            forward.clear();
    }

    public static void goForward(){
        if(!forward.empty())
            back.push(forward.pop());
    }

    public static void goBack(){
        if(!back.empty())
            forward.push(back.pop());
    }
}
