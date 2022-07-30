import com.tohidul.genericsPractice.Tuple;

public class Main {
    public static void main(String[] args) {
        //This is just for practice;
        Tuple<String, String> tuple = new Tuple<>("Hello", "World");

        tuple.showTypes();

        Tuple<String, Integer> person = new Tuple<>("Rahim", 44);

        person.showTypes();

        Tuple<String, Tuple<Integer, Integer>> tupleInsideTuple = new Tuple<>("tupleinsidetuple", new Tuple<>(12,32));


        System.out.println(tupleInsideTuple.getY().getY());

    }
}