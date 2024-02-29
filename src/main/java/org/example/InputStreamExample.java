package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.io.FileOutputStream;

public class InputStreamExample {
    public static void main(String[] args) throws Exception {
        int count = 0;
    try {


        FileInputStream input1 = new FileInputStream("C:\\Users\\6257586\\Desktop\\try.txt");
        FileInputStream input2 = new FileInputStream("C:\\Users\\6257586\\Desktop\\sample.tx");

        FileOutputStream output1 = new FileOutputStream("C:\\Users\\6257586\\Desktop\\kly.txt");

        SequenceInputStream inst = new SequenceInputStream(input1, input2); // this object holds to object as data

        int j;

        while ((j = input1.read()) != -1) {
            if (((char) j) ==  'a' || ((char) j) == 'A') {
                count++;
                System.out.println(count);
            }

        }
        input1.close();
    }catch (IOException e){
        System.out.println(e.getMessage());
    }finally {
        System.out.println(count);
    }
    }
}
