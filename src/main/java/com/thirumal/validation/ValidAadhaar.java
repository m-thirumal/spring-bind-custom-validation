/**
 * 
 */
package com.thirumal.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
/**
 * @author ThirumalM
 */
@Documented
@Constraint(validatedBy = AadhaarValidator.class)
@Retention(RUNTIME)
@Target({FIELD, PARAMETER})
public @interface ValidAadhaar {

    String message() default "{invalid.aadhaar}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
