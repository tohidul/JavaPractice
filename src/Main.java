import com.tohidul.arrayPractice.Fibonacci;
import com.tohidul.arrayPractice.Sorting;
import com.tohidul.arrayPractice.ArrayStat;
import com.tohidul.arrayPractice.PrintArray;
import java.util.Random;
import com.tohidul.arrayPractice.MinMaxFinder;

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

        System.out.println("Max Val: ");
        System.out.println(MinMaxFinder.findMax(a));

        System.out.println("Min Val: ");
        System.out.println(MinMaxFinder.findMin(a));

        System.out.println("Deviation: ");
        System.out.println(ArrayStat.getDeviation(a));

        System.out.println("Get number of time 9 in the array([34,3,2,5,9,9,9,9])");

        int[] anArray = new int[]{34,3,2,5,9,9,9,9};
        System.out.println(ArrayStat.findNTimes(anArray, 9));


    }
}