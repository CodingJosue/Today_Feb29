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
    // we use this catch for the custom
    private static void processFile(String fileName) throws IOException,FileNotFoundException, IllegalArgumentException{
        if(fileName == null|| fileName.isEmpty() ){
            throw new FileNotFoundException("IOException occured during processing the file ");

        } // This is a particular piece of logic  which is an exception for me like its not an actual exception

        if(fileName.length() > 20){
            throw new IllegalArgumentException("File name is too long ");
        }

        // whereas the others are checked exception that java force you to deal wih illegal argument our
        if(fileName.equals("example.txt")){
            throw  new IOException("IOException occured while processing the file ");
        }
    }
}
