package com.tohidul.IOpractice;

import java.io.File;

public class FileCount {
    private String directoryPath;

    public FileCount(String directoryPath){
        this.directoryPath = directoryPath;
    }

    public void setDirectoryPath(String directoryPath){
        this.directoryPath = directoryPath;
    }

    public String getDirectoryPath(){
        return directoryPath;
    }

    public int getTotalFileCount(){
        File dir = new File(directoryPath);
        String[] fileList = dir.list();
        return fileList.length;
    }
}
