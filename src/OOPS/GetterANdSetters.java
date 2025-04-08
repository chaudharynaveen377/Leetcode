package OOPS;

class pen{
    int penno;
    String color;
    void setColor(String clr){
        color=clr;
    }
    void setPenno(int nr){
        penno=nr;
    }
    String getColor(){
        return this.color;
    }
    int getPenno(){
        return this.penno;
    }
}
public class GetterANdSetters {
    public static void main(String[] args) {
        pen p1=new pen();
        p1.setColor("orange");
        p1.setPenno(4);
        System.out.println(p1.getColor());
        System.out.println(p1.getPenno());


    }
}
