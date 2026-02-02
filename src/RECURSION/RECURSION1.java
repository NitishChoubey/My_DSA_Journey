package RECURSION;

public class RECURSION1 {

    public static void main(String[] args) {
        //Write a function that prints hello world
        message() ;
    }

    static void message(){
        //message1() ;
        System.out.println("Hello World1");
        message1() ;

    }

    static void message1(){
        //message2() ;
        System.out.println("Hello World2");
        message2() ;
    }

    static void message2(){
        //message3() ;
        System.out.println("Hello World3");
        message3() ;
    }

    static void message3(){
       // message4() ;
        System.out.println("Hello World4");
        message4() ;
    }

    static void message4(){
        System.out.println("Hello World5");
    }
}
