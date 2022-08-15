package com.tohidul.IOpractice;

import java.io.File;

public class CheckDirectory {
    private String directoryPath;
    private String fileName;

    public CheckDirectory(String directoryPath, String fileName){
        this.directoryPath = directoryPath;
        this.fileName = fileName;
    }

    public void setDirectoryPath(String directoryPath){
        this.directoryPath = directoryPath;
    }
    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    public String getDirectoryPath(){
        return fileName;
    }
    public String getFileName(){
        return directoryPath;
    }

    public boolean isFileExist(){
        File fileToBeChecked = new File(directoryPath + File.separator + fileName);
        return (fileToBeChecked.exists() && !fileToBeChecked.isDirectory());
    }
}
