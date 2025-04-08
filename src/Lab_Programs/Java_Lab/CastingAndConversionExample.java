package Lab_Programs.Java_Lab;

public class CastingAndConversionExample {
    public static void main(String[] args) {
        int i=(int)(Math.PI);
        int j=(int)(3.2*1.2);
        System.out.println("i= " +i+" j= "+j);

        byte b=(byte)345;
        short s=(short)65537;
        System.out.println("b= " + b+" s= "+ s);

        System.out.println("convering int to char " + (char)75);
        System.out.println("convering  char To int " + (int)('K'));

        double d=i*b*s*2.0;
        System.out.println("conversion to double result is : " +d);
        i=3<<2;
        System.out.println("i= " +i);
    }
}
