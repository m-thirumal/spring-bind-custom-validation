/**
 * 
 */
package com.thirumal.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

/**
 * @author ThirumalM
 */
@Documented
@Constraint(validatedBy = PanValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPan {

    String message() default "{invalid.pan}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
    
}
