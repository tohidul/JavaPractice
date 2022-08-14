package com.tohidul.IOpractice;

import java.io.FileInputStream;
import java.io.IOException;

public class MyInputStream {
    private String fileName;

    public MyInputStream(String fileName){
        this.fileName = fileName;
    }

    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    public String getFileName(){
        return fileName;
    }

    public void readFile(){
        FileInputStream in = null;
        try{
            in = new FileInputStream(fileName);
            int c;
            while((c = in.read()) != -1){
                System.out.print((char)c + ", ");
            }
        }catch (IOException e){
            System.err.println("could not read file");
        }finally {
            if(in != null){
                try{
                    in.close();
                }catch (IOException ei){
                    System.err.println("Could not close input stream");
                }
            }
        }
    }
}
