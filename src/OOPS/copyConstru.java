package OOPS;

public class copyConstru {
  static class student{
        int rno;
        String name;
        int marks;
        student( student s){
           this.rno=s.rno;
            this.name=s.name;
            this.marks= s.marks;
        }
        student(){

        }

    }
    public static void main(String[] args) {
        student s1=new student();
        s1.name="naveen";
        s1.marks=100;
        s1.rno=12;
//        copy the value of s1 in s2
        student s2=new student(s1);
        System.out.println(s2.marks);
    }
}
