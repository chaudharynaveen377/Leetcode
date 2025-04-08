package Lab_Programs;

public class prime {
    public static void main(String[] args) {
        int i,j;
        for (i=1;i<30;i++){
            for ( j=2;j<i;j++){
                if (j==i-1){
                    System.out.println(i+" ");
                }
                if (i%j==0){
                    break;}
                }
        }
    }
}
