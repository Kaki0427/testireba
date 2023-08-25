public class testPerimeter {
    public static double calculateCirclePerimeter(double radius) {
        if (radius <= 0) {
            System.out.println("რადიუსი უნდა იყოს დადებითი რიცხვი.");
        }

        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
    public static void main(String[] args) {
        double radius = 5.0;
        double perimeter = calculateCirclePerimeter(radius);
        System.out.println("წრეწირის პერიმეტრია " + perimeter);
    }
}
