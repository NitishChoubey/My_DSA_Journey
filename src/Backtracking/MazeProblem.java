package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class MazeProblem {
    public static void main(String[] args) {
        //Normal simple problem ...ek maze hai starting point let say (3,3) hai hme (1 ,1) pe jana hai ,
        //aur hm kewal down and right ke taraf jaa skte hai , toh hme total number of paths return krne hai


        //int ans = countWay(3 , 3) ;
        //System.out.println(ans);

        //printPath("" , 3 , 3) ;

        List<String> ans = printPathDiagonalIncluded("" , 3 , 3) ;
        System.out.println(ans);


    }


    public static int countWay(int row , int col){

        //base condition --> jaise hi hm row = 1 me pahuche ya column = 1 me pahuchenge toh kewal 1 hi way hoga yaa to niche jaayenge yaa right me
        if(row == 1 || col == 1){
            return 1 ;
        }

        int leftSide = countWay(row -1 , col) ;
        int rightSide = countWay(row , col - 1) ;

        return leftSide + rightSide ;
    }


    public static void printPath(String p , int row , int col){

        //D --> Down , R--> Right
        if(row == 1 && col == 1){
            System.out.println(p);
            return ;
        }


        if(row > 1){
            printPath(p + 'D' , row - 1 , col) ;
        }

        if(col > 1){
            printPath(p + 'R' , row , col - 1) ;
        }

    }


    public static List<String> printPathDiagonalIncluded(String p , int row , int col){
        //now we can go diagonal also
        // D -->  Diagonal , H --> Horizontal , V--> vertical
        if(row == 1 && col == 1){
            List<String> list = new ArrayList<>() ;
            list.add(p) ;
            return list ;
        }

        List<String> list = new ArrayList<>() ;

        //diagonal case
        if(row > 1 && col > 1){
            list.addAll(printPathDiagonalIncluded(p + 'D' , row - 1 , col -1)) ;
        }

        if(row > 1){
           list.addAll(printPathDiagonalIncluded(p + 'V' , row - 1 , col)) ;
        }

        if(col > 1){
            list.addAll(printPathDiagonalIncluded(p + 'H' , row  , col - 1)) ;
        }

        return list ;
    }
}
