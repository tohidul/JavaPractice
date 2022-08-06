package com.tohidul.IOpractice;
import java.io.File;

public class RenameExample {

    public static void renameFile(String oldFileName, String newFileName){
        File oldFile = new File(oldFileName);
        File newFile = new File(newFileName);

        boolean fileRenamed = oldFile.renameTo(newFile);

        if (fileRenamed) {
            System.out.println("File Renamed");
        } else {
            System.out.println("File rename failed.");
        }
    }
}
