package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Except8 {
    public static void main(String[] args) {
        String path="src/main/java/Exceptions/notes.txt";
        try {
            FileInputStream fileInputStream=new FileInputStream(path);
            int a=0;
            while((a=fileInputStream.read())!=-1){
                System.out.print((char) a);
            }





        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
