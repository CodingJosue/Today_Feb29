package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamExample {
    public static void main(String[] args) throws IOException{
        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            in = new FileInputStream("C:\\\\Users\\\\6257586\\\\Desktop\\\\sample.txt");
            out = new FileOutputStream("C:\\\\Users\\\\6257586\\\\Desktop\\\\output.txt");

            int c;
            while ((c = in.read()) != -1){
                out.write(c);
            }
        }finally {
            if(in != null ) in.close(); // after we read everything they are still some daata that cannot be null if we escape the for loops they must be some data but we still close it
            if(out != null) out.close();
        }
    }
}
