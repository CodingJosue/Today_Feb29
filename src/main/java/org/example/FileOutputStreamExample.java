package org.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        // must have a catch close to be able for exceptions
        try{

            FileOutputStream fout = new FileOutputStream("C:\\Users\\6257586\\Desktop\\try.txt");
            String s = "Welcome to java advance string byte array";
            byte[] b = s.getBytes();
            fout.write(b);
            fout.close();

        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Success");
        }
    }
}
