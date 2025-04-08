package Daily_Leetcodde.java.Medium;

public class The_punishment_2698 {
    static int sumval(int val,int i,int j){
        int ten=1;
        for(int k=0;k<i;k++){
            ten=ten*10;
        }
        int sum=val/ten;
        ten=1;
        for(int k=0;k<j;k++){
            ten=ten*10;
        }
         sum+=val%ten;
        return sum;

    }
    static int count_digit(int val){
        if (val==0){
            return 0;
        }
       return 1+ count_digit(val/10);
    }
    static boolean checkResult(int n){
int sqre=n*n;
    int x=count_digit(n);
    for (int i=1;i<=x;i++){
          if (sumval(sqre,i,x-i)==n){
              return true;
          }
    }
return false;
    }
    static int ans(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            if (checkResult(i)){
                sum=sum+i*i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(checkResult(1));
        System.out.println(ans(n));
    }
}
