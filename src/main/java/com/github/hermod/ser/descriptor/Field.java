package com.github.hermod.ser.descriptor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>Field. </p>
 *
 * @author anavarro - Mar 17, 2013
 *
 */
@Retention(RetentionPolicy.RUNTIME) 
@Target({ElementType.METHOD}) 
public @interface Field {

    int id();
    String docName() default "";
    String name();
    boolean mandatory() default false;
    
}
