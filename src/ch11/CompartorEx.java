package ch11;

import java.util.Arrays;
import java.util.Comparator;

public class CompartorEx {
    public static void main(String[] args) {

        String[] strArr = {"cat","dog","lion", "tiger"};

        Arrays.sort(strArr);
        System.out.println("strArr = " + Arrays.toString(strArr));

        Arrays.sort(strArr,String.CASE_INSENSITIVE_ORDER);
        System.out.println("strArr = " + strArr);



    }
}

class Descending implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}