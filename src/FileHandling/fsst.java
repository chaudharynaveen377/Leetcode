package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class fsst {
    public static void main(String[] args) {
        String path="C:\\Users\\NAVEEN\\Desktop\\TEXT1.txt";
        File file=new File(path);
        try {
          boolean flag= file.createNewFile();
          if (flag){
              System.out.println("file is created..");
          }
          else {
              System.out.println("file already created..?");
          }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        using FileOutputStream along wuth Scanner:
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the file name with location..");
            String fileName = sc.nextLine();
            FileOutputStream fos = new FileOutputStream(fileName,true);
            System.out.println("Enter the file content : ");
           String content= sc.nextLine();
           byte b[]=content.getBytes();
           fos.write(b);
           fos.close();
            System.out.println("file is saved on the given location path :");
        }
        catch (Exception e){
            System.out.println("some exception come..");
                  e.printStackTrace();
        }

    }
}
