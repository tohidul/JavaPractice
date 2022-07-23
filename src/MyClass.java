public class MyClass {

    public  void printText(String text){
        System.out.println(text);
    }

    public void writeText(String text1, String text2){
        System.out.print(text1);
        System.out.print(text2);
    }

    public int sum(int value1, int value2){
        return value1 + value2;
    }

    public String concat(String value1, String value2) throws IllegalArgumentException {
        if (value1==null){
            throw new IllegalArgumentException("value1 is null");
        }
        if(value2 == null){
            throw new IllegalArgumentException("value2 is null");
        }

        return value1 + value2;
    }
}
