import java.util.Scanner;

public class inputDemo {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter a number");
        int a = scr.nextInt();
        int b = scr.nextInt();
        int result = a+b;
        System.out.println("The result is: "+result);
    }
}
