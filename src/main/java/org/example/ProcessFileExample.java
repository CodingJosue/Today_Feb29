package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ProcessFileExample {
    public static void main(String[] args) {

        try{
            processFile("sample.txt");
        }catch (FileNotFoundException ex){
            System.out.println(ex);
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());

        }

    }
    private static void processFile(String fileName) throws FileNotFoundException, IOException{
        if(fileName == null|| fileName.isEmpty() ){
            throw new IOException("IOException occured during processing the file ");

        }
        if(fileName.length() > 20){
            throw new IllegalArgumentException("File name is too long ");
        }

        if(fileName.equals("example.txt")){
            throw  new IOException("IOException occured while processing the file ");
        }
    }
}
