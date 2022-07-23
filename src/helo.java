import com.bazlur.java.Person;
import com.tohidul.shapes.Shapes;
import com.tohidul.exp.Experiment;
import com.tohidul.arrayPractice.MyStack;
import com.tohidul.arrayPractice.Fibonacci;

public class helo{
    public static void main(String[] args) {

        int[] a = new int[100];



        Fibonacci exp1 = new Fibonacci();
        a = exp1.printFibonacci();
        for(int i=0;i<a.length; i++){
            System.out.print(a[i]);
        }





    }
}