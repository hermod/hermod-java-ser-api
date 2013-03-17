package com.github.hermod.ser.descriptor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>Message. </p>
 *
 * @author anavarro - Mar 17, 2013
 *
 */
@Retention(RetentionPolicy.RUNTIME) 
@Target({ElementType.TYPE}) 
public @interface Message {
    
    int id();
    String name() default "";
    String docName() default "";
    Class<?>[] responseMessages();

}
