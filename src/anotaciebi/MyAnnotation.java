package anotaciebi;

import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface MyAnnotation {
    int value() default 5;

    String value2();
    String value3();
}
