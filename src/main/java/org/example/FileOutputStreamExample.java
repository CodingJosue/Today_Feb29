package org.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        // must have a catch close to be able for exceptions
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");

            FileOutputStream fout = new FileOutputStream("C:\\Users\\6257586\\Desktop\\try.txt"); // creates the file for you
            fout.write(65);
            fout.close();
            sc.close();
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Success");
        }
    }
}
