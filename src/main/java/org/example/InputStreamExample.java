package org.example;

import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.io.FileOutputStream;

public class InputStreamExample {
    public static void main(String[] args) throws Exception {

        FileInputStream input1 = new FileInputStream("C:\\Users\\\\6257586\\\\Desktop\\\\try.tx");
        FileInputStream input2 = new FileInputStream("C:\\Users\\6257586\\Desktop\\sample.tx" );

        FileOutputStream output1  = new FileOutputStream("C:\\Users\\6257586\\Desktop\\kly.txt");

        SequenceInputStream inst = new SequenceInputStream(input1,input2); // this object holds to object as data

        int j;
        while((j = inst.read()) != -1){
            System.out.println((char) j);
            output1.write(j);
        }

    }
}
