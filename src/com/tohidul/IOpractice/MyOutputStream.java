package com.tohidul.IOpractice;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class MyOutputStream {
    private String outputFile;

    public MyOutputStream(String outputFile){
        this.outputFile = outputFile;
    }

    public void setOutputFile(String outputFile){
        this.outputFile = outputFile;
    }

    public String getOutputFile(){
        return outputFile;
    }

    public void writeToFile(String strObj){
        try{
            FileOutputStream fos = new FileOutputStream(outputFile);
            fos.write(strObj.getBytes());
            fos.flush();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
