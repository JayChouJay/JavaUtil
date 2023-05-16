package thread.producerandcustomer;

import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;

@Target({METHOD})
public @interface MyAnnotation {
    String te = "1";

    String value();

    String test() default "1";
}
