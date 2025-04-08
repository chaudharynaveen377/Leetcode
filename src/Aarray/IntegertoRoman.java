package Aarray;

public class IntegertoRoman {
    static String inttonum(int num,String s){
        while (num!=0){
            if (num>=1000){
                s=s+"M";
                num=num-1000;
                continue;
            }
            if (num>=900){
                s=s+"CM";
                num=num-900;
                continue;
            }
            if (num>=500){
                s=s+"D";
                num=num-500;
                continue;
            }
            if (num>=100){
                s=s+"C";
                num=num-100;
                continue;
            }
            if (num>=90){
                s=s+"XC";
                num=num-90;
                continue;
            }
            if (num>=50){
                s=s+"L";
                num=num-50;
                continue;
            }
            if (num>=40){
                s=s+"XL";
                num=num-40;
                continue;
            }
            if (num>=10){
                s=s+"X";
                num=num-10;
                continue;
            }
            if (num>=9){
                s=s+"IX";
                num=num-9;
                continue;
            }
            if (num>=5){
                s=s+"V";
                num=num-5;
                continue;
            }
            if (num>=4){
                s=s+"IV";
                num=num-4;
                continue;
            }
            if (num>=1){
                s=s+"I";
                num=num-1;
                continue;
            }
        }
        return s;
    }
    public static void main(String[] args) {
       int num=1211;
        String s=""+num;
     int arr[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
     String brr[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        System.out.println(inttonum(1994,s));
    }
}
