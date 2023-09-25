package anotaciebi;
public class Fraction {
    private int numerator;
    private int denominator;

    @Override
    public String toString(){
        return super.toString();
    }
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    @Deprecated
    public void printFraction(){
        System.out.println(this.numerator + " " + this.denominator);
    }
    @MyAnnotation(value2 = "bimbim", value3 = "bambam")
    public void printAnotherFraction(){
        System.out.println(this.numerator + "/" + this.denominator);
    }
}
