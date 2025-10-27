/**
 * 
 */
package com.thirumal.validation;

import java.util.regex.Pattern;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * @author ThirumalM
 */
public class AadhaarValidator implements ConstraintValidator<ValidAadhaar, String> {

	// Aadhaar: 12 digits, not starting with 0 or 1
    private static final Pattern AADHAAR_PATTERN = Pattern.compile("^[2-9]{1}[0-9]{11}$");

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (value == null || value.isBlank()) {
            return true; // handled separately by @NotBlank
        }
        return AADHAAR_PATTERN.matcher(value).matches();
	}

}
