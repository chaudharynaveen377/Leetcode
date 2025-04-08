package leetcode;

public class PivotInteger {
    public static void main(String[] args) {
        int n=8;
        int leftsum=0;
        int rightsum=8;
//        for (int i=1;i<=n;i++){
//            leftsum=i*(1+i)/2;
//            rightsum=n*(1+n)/2-i*(i-1)/2;
//            if (leftsum==rightsum){
//                System.out.println(i);
//                return;
//            }
//        }
//        System.out.println(-1);

//        two pointer approach
            int p1=1;
            int p2=rightsum;
            while(p1<=p2){
                if (leftsum<rightsum ) {
                    leftsum = leftsum + p1;
                    p1=p1+1;

                }
                 if (leftsum>rightsum){
                    rightsum=rightsum+p2;
                    p2=p2-1;
                }
                if (leftsum==rightsum ){
                    System.out.println(p2);
                    return;
                }
            }
    }
}
