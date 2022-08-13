package com.tohidul.IOpractice;
import java.io.File;
import java.io.IOException;

public class DeleteFile {
    private String fileName;

    public DeleteFile(String fileName){
        this.fileName = fileName;
    }
    public void setFileName(String fileName){
        this.fileName = fileName;
    }
    public String getFileName(){
        return this.fileName;
    }

    public void deleteFile(){
        File fileToDelete = new File(this.fileName);
        fileToDelete.delete();
    }

    public void fileDeleteOnExit(){
        File fileToDelete = new File(this.fileName);
        fileToDelete.deleteOnExit();
    }
}
