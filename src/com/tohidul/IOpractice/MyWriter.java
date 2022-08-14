package com.tohidul.IOpractice;

import java.io.FileWriter;
import java.io.Writer;
import java.io.IOException;

public class MyWriter {
    private String outputFileName;

    public MyWriter(String outputFileName){
        this.outputFileName = outputFileName;
    }

    public void setOutputFileName(String outputFileName){
        this.outputFileName = outputFileName;
    }

    public String getOutputFileName(){
        return outputFileName;
    }

    public void writeToFile(String content){
        Writer writer;

        try{
            writer = new FileWriter(outputFileName);
            writer.write(content);
            writer.flush();
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
