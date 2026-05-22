package Backtracking;

public class MazeWithObstacles {
    public static void main(String[] args) {

        //iss question me 3x3 ka matrix aur maze hai row indexed --> 0 ,1 , 2 and column --> 0 , 1, 2
        //hme (0 , 0) se (2 , 2) pe jana hai , but bich me (1 , 1) pe obstacle hai , and aap uss obstacle pe nhi jaa skte , usko cross nhi kr skte
        // toh aapko paths print krne hai

//        boolean[][] board = {
//            {true , true , true} ,
//            {true , false , true},
//            {true , true , true}
//        } ;
//
//        printPaths("" , board , 0 , 0 ) ;

        boolean[][] board = {
                {true , true , true} ,
                {true , true , true},
                {true , true , true}
        } ;

        allPaths("" , board , 0 , 0) ;





    }

    public static void printPaths(String p , boolean[][] maze , int row , int col){

        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(p);
            return ;
        }

        if(!maze[row][col]){
            return ;
        }

        if(row < maze.length - 1){
            printPaths(p + "D" , maze , row + 1  , col) ;
        }

        if(col < maze[0].length - 1) {
            printPaths(p + "R", maze, row , col + 1);
        }
    }

    public static void  allPaths(String p , boolean[][] maze , int row , int col){

        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(p);
            return ;
        }

        if(!maze[row][col]){
            return ;
        }

        //visited cells ko false kr do , taaki particular path me piche naa jaa paaye
        maze[row][col] = false ;

        //condition for going down
        if(row < maze.length - 1){
            allPaths(p + 'D'  ,maze , row  +1 , col) ;
        }

        //condition of going UP
        if(row > 0){
            allPaths(p + 'U' , maze , row - 1 , col) ;
        }

        //condition of going right
        if(col < maze[0].length - 1){
            allPaths(p + 'R' , maze , row , col + 1);
        }

        //condition of going left
        if(col > 0){
            allPaths(p + 'L' , maze , row , col - 1) ;
        }

        //ab function over mtlv destination tk pahuch gye ...phir se saare changes ko revert kr do
        maze[row][col] = true ;


    }
}
