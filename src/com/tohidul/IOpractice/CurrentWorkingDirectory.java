package com.tohidul.IOpractice;

public class CurrentWorkingDirectory {
    public static void getCurrentDirectory(){
        String workingDir = System.getProperty("user.dir");
        System.out.println(workingDir);
    }
}
