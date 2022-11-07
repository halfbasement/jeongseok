package ch11;

import java.util.Arrays;

public class CompartorEx {
    public static void main(String[] args) {

        String[] strArr = {"cat","dog","lion", "tiger"};

        Arrays.sort(strArr);
        System.out.println("strArr = " + Arrays.toString(strArr));

        Arrays.sort(strArr,String.CASE_INSENSITIVE_ORDER);
        System.out.println("strArr = " + strArr);



    }

    
}
