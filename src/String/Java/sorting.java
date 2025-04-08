package String.Java;

public class sorting {
    static void disp(String []str){
        for (int i = 0; i < str.length; i++) {
            System.out.print(" "+str[i]);
        }
    }
    static void sort(String [] str){
        for (int i=0;i<str.length;i++){
            for (int j=0;j<str.length-1;j++){
                if (str[j].charAt(0)-'A' > str[j+1].charAt(0)-'A'){
                    String temp=str[j];
                    str[j]=str[j+1];
                    str[j+1]=temp;
                }
            }
        }
        disp(str);
    }
    public static void main(String[] args) {
        String[] names = { "Alice", "Diana", "Charlie", "Bob", "Eve" };
        System.out.println('B'-'A');
        sort(names);
        StringBuffer st=new StringBuffer("naveen chaudhary");

        System.out.println(st);

//        disp(names);
    }
}
