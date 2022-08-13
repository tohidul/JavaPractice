import com.tohidul.IOpractice.GetFileList;
import com.tohidul.IOpractice.RenameExample;
import java.io.IOException;

import com.tohidul.IOpractice.DeleteFile;
public class Main {
    public static void main(String[] args) throws IOException {
        //This is just for practice;
        // Will add more practice;
       GetFileList myDir = new GetFileList("D:");

       myDir.showFilesOnADirectory();

    }
}