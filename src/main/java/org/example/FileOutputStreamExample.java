package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        // must have a catch close to be able for exceptions
        try{

            FileInputStream fin = new FileInputStream("C:\\\\Users\\\\6257586\\\\Desktop\\\\try.txt" );
            int i = 0;

            System.out.println(i);
           while((i = fin.read()) != -1){
               System.out.print((char) i); // specific syntax
           }
        fin.close();
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Success");
        }
    }
}
