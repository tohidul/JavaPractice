package com.tohidul.IOpractice;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MyReader {
    private String inputFileName;

    public MyReader(String inputFileName){
        this.inputFileName = inputFileName;
    }

    public void setInputFileName(String inputFileName){
        this.inputFileName = inputFileName;
    }
    public String getInputFileName(){
        return inputFileName;
    }
    public void printFileContent(){
        Reader reader = null;
        try{
            reader = new FileReader(inputFileName);
            int c;
            while ((c = reader.read()) != -1){
                char ch = (char) c;
                System.out.print(ch);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(reader != null){
                    reader.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
