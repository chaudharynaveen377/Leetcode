package Exception_Handling;

public class First {
    public static void main(String[] args) {

        try {
            System.out.println(10/0);
        }
        catch (Exception  e){
            System.out.println(e.getMessage() );
          
        }
    }
}
