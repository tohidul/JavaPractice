package com.tohidul.IOpractice;

import java.io.*;

public class TransferContent {
    private String sourceDirectoryPath;
    private String targetDirectoryPath;

    public TransferContent(String sourceDirectoryPath, String targetDirectoryPath){
        this.sourceDirectoryPath = sourceDirectoryPath;
        this.targetDirectoryPath = targetDirectoryPath;
    }

    public void setSourceDirectoryPath(String sourceDirectoryPath){
        this.sourceDirectoryPath = sourceDirectoryPath;
    }
    public void setTargetDirectoryPath(String targetDirectoryPath){
        this.targetDirectoryPath = targetDirectoryPath;
    }

    public String getSourceDirectoryPath(){
        return sourceDirectoryPath;
    }
    public String getTargetDirectoryPath(){
        return targetDirectoryPath;
    }

    public void transferContents(){
        File sourceFile = new File(sourceDirectoryPath);
        String text = "";
        if(sourceFile.exists() && !sourceFile.isDirectory()){
            Reader reader = null;
            try{
                reader = new FileReader(sourceFile);
                int c;
                while ((c = reader.read()) != -1){
                    char ch = (char) c;
                    text = text + ch;
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
        Writer writer;

        try{
            writer = new FileWriter(targetDirectoryPath);
            writer.write(text);
            writer.flush();
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
