import com.tohidul.IOpractice.GetFileList;
import com.tohidul.IOpractice.FileCount;
import com.tohidul.IOpractice.MyOutputStream;
import java.io.IOException;

import com.tohidul.IOpractice.DeleteFile;
public class Main {
    public static void main(String[] args) throws IOException {
        //This is just for practice
        FileCount testFileCount = new FileCount("E:\\");
        System.out.println(testFileCount.getTotalFileCount());

    }
}