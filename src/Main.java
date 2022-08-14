import com.tohidul.IOpractice.GetFileList;
import com.tohidul.IOpractice.PrintFileTextStat;
import com.tohidul.IOpractice.MyOutputStream;
import java.io.IOException;

import com.tohidul.IOpractice.DeleteFile;
public class Main {
    public static void main(String[] args) throws IOException {
        //This is just for practice
        PrintFileTextStat prntStat = new PrintFileTextStat("E:\\java_practice\\test\\src\\testInput.txt");

        prntStat.computeStat();
        prntStat.printStat();

    }
}