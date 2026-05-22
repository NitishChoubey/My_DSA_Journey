package LearningQuestions;

import java.util.ArrayList;

public class ArrayListt {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>() ;

       // System.out.println(list.isEmpty());

        list.add(10) ;
        list.add(20) ;
        list.add(30) ;
        System.out.println(list.get(0));
        list.remove(0) ;
        System.out.println(list.get(0));


    }
}
