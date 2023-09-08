package Chapter10;

public class Chapter10_2 {
    private String name;
    private int age;
    private double weight; // in pounds
    private double height; // in inches

    public Chapter10_2(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Chapter10_2(String name, double weight, double feet, double inches) {
        this.name = name;
        this.weight = weight;
        this.height = (feet * 12) + inches; // Convert feet and inches to inches
    }

    public double getBMI() {
        double bmi = (weight / (height * height)) * 703; // BMI formula
        return bmi;
    }

    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}

