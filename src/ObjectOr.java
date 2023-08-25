public class ObjectOr {
    public static void main(String[] args) {
        CarFactory tucson = new CarFactory();
        tucson.name = "Hyundai Tucson";
        tucson.color = "Blue";
        tucson.engine = 2.0F;
        tucson.releaseYear = 2019;
        tucson.getInfo();

        CarFactory rav4 = new CarFactory();
        rav4.name = "Toyota Rav 4";
        rav4.color = "Yellow";
        rav4.engine = 2.0F;
        rav4.releaseYear = 2020;

        rav4.getInfo();
        CarFactory rav4_1 = rav4;

        rav4_1.color = "Green";
        rav4.getInfo();
        rav4 = null;
        rav4_1.getInfo();
        rav4.getInfo();
        rav4_1 = null;
    }
}
