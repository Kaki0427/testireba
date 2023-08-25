public class CarFactory {
    String name;
    String color;
    float engine;
    int releaseYear;

    void drive(){
        System.out.println("Driving...");
    }

    void getInfo(){
        System.out.println(name + " - " + color);
    }
}
