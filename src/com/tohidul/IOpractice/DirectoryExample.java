package com.tohidul.IOpractice;
import java.io.File;
import java.io.IOException;


public class DirectoryExample {
    public static void createDirectoryAndFile(String dirPath, String fileNAme) throws IOException {
        File dir = new File(dirPath);
        String dirStr = dir.getPath();

        System.out.println("Directory path: "+ dirStr);

        String absoluteFilePath = dirStr + File.separator + fileNAme;
        File file = new File(absoluteFilePath);

        file.createNewFile();

        System.out.println("File path: "+ file.getPath());
    }
}
