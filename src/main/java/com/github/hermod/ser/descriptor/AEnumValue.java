package com.github.hermod.ser.descriptor;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>AField. </p>
 *
 * @author anavarro - Mar 17, 2013
 *
 */
@Retention(RetentionPolicy.RUNTIME) 
@Target({ElementType.FIELD}) 
@Documented
public @interface AEnumValue {

    
    /**
     * docName.
     *
     * @return
     */
    String docName() default "";
    
    /**
     * docComment.
     *
     * @return
     */
    String docComment() default "";
    
    /**
     * name.
     *
     * @return
     */
    String name() default "";
    
}
