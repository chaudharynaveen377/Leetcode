package OOPS;

public class Inheretence {
    static class student{
        int rno;
        String name;
        int marks;
    }
    static class fish extends student{

    }
    public static void main(String[] args) {
        student s1=new student();
        s1.rno=34;
        fish f1=new fish();
        f1.name="jelly";
        System.out.println(f1.name);

    }
}
