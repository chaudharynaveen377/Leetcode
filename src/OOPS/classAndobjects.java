package OOPS;
class students {
    int age=20;
    String name="naveen";
    students(int age , String name){
        this.age=age;
        this.name=name;
    }
    students(){

    }
}

public class classAndobjects {

    public static void main(String[] args) {
        students naveen=new students(3,"naveen");
        students chq=new students();
        System.out.println(naveen.age);
    }
}
