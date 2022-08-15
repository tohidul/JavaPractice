import com.tohidul.IOpractice.GetFileList;
import com.tohidul.IOpractice.TransferContent;
import com.tohidul.IOpractice.MyOutputStream;
import java.io.IOException;

import com.tohidul.IOpractice.DeleteFile;
public class Main {
    public static void main(String[] args) throws IOException {
        //This is just for practice
        TransferContent myTransferObj = new TransferContent("E:\\test_file.txt", "E:\\output_test_file.txt");
        myTransferObj.transferContents();
    }
}