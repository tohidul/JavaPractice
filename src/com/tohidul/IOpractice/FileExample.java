package com.tohidul.IOpractice;
import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void createFile(String filePath){
        File file = new File(filePath);

        if(file.exists()){
            System.out.println("File already exists");
        }
        else{
            System.out.println("File Does not exist. creating one...");
            try{
                file.createNewFile();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
