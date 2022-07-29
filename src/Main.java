import com.tohidul.OopPractice.Animal;
import com.tohidul.OopPractice.Horse;
import com.tohidul.OopPractice.UseAnimal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Horse();
        UseAnimal useAnimal  = new UseAnimal();

        useAnimal.doSomething(animal);

    }
}