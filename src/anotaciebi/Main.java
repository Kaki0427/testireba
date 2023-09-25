package anotaciebi;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws NoSuchMethodException {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Fraction fraction = new Fraction(1 ,2);
        fraction.printFraction();
        fraction.printAnotherFraction();

        Method result = fraction.getClass().getMethod("printAnotherFraction");
        MyAnnotation res = result.getAnnotation(MyAnnotation.class);
        System.out.println(res.value2());
        System.out.println(res.value3());
    }
}
