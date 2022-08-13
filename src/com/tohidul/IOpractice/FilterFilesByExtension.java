package com.tohidul.IOpractice;
import java.io.File;
import java.io.FileFilter;

public class FilterFilesByExtension {
    private String fileDir;
    private String extension;

    public FilterFilesByExtension(String fileDir, String extension){
        this.fileDir = fileDir;
        this.extension = extension;
    }

    public void setFileDir(String fileDir){
        this.fileDir = fileDir;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getFileDir(){
        return fileDir;
    }
    public String getExtension(){
        return extension;
    }

    public String[] getFilePaths(){
        File directory = new File(fileDir);
        FileFilter extensionFilter = new FileFilter(){

            @Override
            public boolean accept(File pathname){
                String filename = pathname.getName();
                if(filename.endsWith("."+extension)){
                    return true;
                }
                return false;
            }
        };

        File[] listOFFilesWithExtension = directory.listFiles(extensionFilter);
        String[] listOfFileNameWithExtension = new String[listOFFilesWithExtension.length];
        int i = 0;

        for(File file : listOFFilesWithExtension){
            listOfFileNameWithExtension[i] = file.getName();
            i++;
        }
        return listOfFileNameWithExtension;
    }
}
