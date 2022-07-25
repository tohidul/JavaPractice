import com.tohidul.OopPractice.AreaCalculator;
import com.tohidul.OopPractice.AreaCalculatorTriangle;

public class Main {
    public static void main(String[] args) {
        AreaCalculator test_area = new AreaCalculator();
        AreaCalculatorTriangle test_triangle_area = new AreaCalculatorTriangle();

        System.out.println("Circle Area: "+test_area.getArea(3));
        System.out.println("Rectangle Area: "+test_area.getArea(3,4));
        System.out.println("Triangle Area: "+test_triangle_area.getArea(3,4));
        System.out.println("Cylinder Area: "+test_area.getArea(3.0,4.0));


    }
}