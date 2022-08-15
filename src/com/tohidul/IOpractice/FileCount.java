package com.tohidul.IOpractice;

import java.io.File;
import java.io.File;
import java.io.FileFilter;


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
        FileFilter fileFilter = new FileFilter(){
            @Override
            public boolean accept(File pathname){
                return  !pathname.isDirectory();
            }
        };
        File[] fileList = dir.listFiles(fileFilter);
        return fileList.length;
    }
}
