package cn.zxl.annotation;

import java.lang.annotation.*;

/**
 * @Author: JavaZ5G
 */

@Documented
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Study {
    String value() default "LeetCode";

    String name() default "Java";
}
