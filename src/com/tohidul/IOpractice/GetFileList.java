package com.tohidul.IOpractice;
import java.io.File;

public class GetFileList {
    private String directoryStr;
    public GetFileList(String directoryStr){
        this.directoryStr = directoryStr;
    }
    public void setDirectoryStr(String directoryStr){
        this.directoryStr = directoryStr;
    }
    public String setDirectoryStr(){
        return directoryStr;
    }

    public void showFilesOnADirectory(){
        File myDir = new File(directoryStr);
        File[] listOfFiles = myDir.listFiles();

        for(File file : listOfFiles){
            System.out.println(file.getPath());
        }
    }
}
