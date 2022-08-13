import com.tohidul.IOpractice.GetFileList;
import com.tohidul.IOpractice.FilterFilesByExtension;
import java.io.IOException;

import com.tohidul.IOpractice.DeleteFile;
public class Main {
    public static void main(String[] args) throws IOException {
        //This is just for practice;
        // Will add more practice;
       FilterFilesByExtension txtExt = new FilterFilesByExtension("E:\\", "txt");

        for(String f : txtExt.getFilePaths()){
            System.out.println(f);
        }
    }
}