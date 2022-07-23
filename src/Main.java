import com.tohidul.arrayPractice.Fibonacci;
import com.tohidul.arrayPractice.Sorting;
import com.tohidul.arrayPractice.ArrayStat;
import com.tohidul.arrayPractice.PrintArray;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] a = new int[100];
        int[] sortedArray = new int[100];

        for(int i=0; i<a.length; i++){
            Random aRandomObject = new Random();
            a[i] = aRandomObject.nextInt();
        }
        System.out.println("Un-sorted Array: ");
        PrintArray.printArray(a);
        sortedArray = Sorting.selectionSort(a);
        System.out.println("Sorted Array");
        PrintArray.printArray(sortedArray);

        System.out.println("Mean: "+ArrayStat.mean(a));
        System.out.println("Median: "+ArrayStat.median(a));


    }
}