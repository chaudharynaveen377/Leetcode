package Recursion;

public class mazePath {
    static int maze(int sr,int sc,int er,int ec){
        if (sr>er || sc>ec){return 0;}
        if (sr==er && sc==ec){return 1;}
        System.out.println("sr");
        System.out.println(sr);
        System.out.println();
        System.out.println("cols");
        System.out.println(sc);
        System.out.println();
//        int downways=maze(sr+1,sc,er,ec);
//        int rightways=maze(sr,sc+1,er,ec);
//        int totalways=downways+rightways;

        int totalways=maze(sr+1,sc,er,ec)+maze(sr,sc+1,er,ec);
        return totalways;
    }

    public static void main(String[] args) {
        int rows=4;
        int cols=3;
        int count=maze(1,1,rows,cols);
        System.out.println("total no. of path is "+count);
    }
}
