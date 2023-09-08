public class Person {
    private static int counter = 0;
    public static int getCounter(){
        return counter;
    }

    private String name;
    private int age;


    static {
        counter = 5;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
