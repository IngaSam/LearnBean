package org.example.aop;

import java.lang.annotation.*;
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Loggable{
        String value() default "INFO";
        int times() default 1;
}


