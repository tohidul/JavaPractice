import com.tohidul.IOpractice.GetFileList;
import com.tohidul.IOpractice.CheckDirectory;
import com.tohidul.IOpractice.MyOutputStream;
import java.io.IOException;

import com.tohidul.IOpractice.DeleteFile;
public class Main {
    public static void main(String[] args) throws IOException {
        //This is just for practice
        CheckDirectory testFile = new CheckDirectory("E:\\", "test_file2.txt");
        System.out.println(testFile.isFileExist());

    }
}