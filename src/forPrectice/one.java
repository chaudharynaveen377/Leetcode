package forPrectice;

public class one {
    static class age{
        public int years;
        public int months;
        public int days;
       public age(int years,int months,int days){
            this.days=days;
            this.years=years;
            this.months=months;
        }
    }
    static class node{
        node left;
        node right;
        int data;
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }
    public static void main(String[] args) {
        int x=0;
        short y=4747;
        age a=new age(12,13,14);

//        overflow -32768 to  32767
        System.out.println(x);

//        an algorithm  is a step by step precedure ,
//        or a set of instructions designed to perform a specific task or salve a particular problem
    }
}
