package com.thirumal.validation;

import java.util.regex.Pattern;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
/**
 * @author ThirumalM
 */
public class PanValidator implements ConstraintValidator<ValidPan, String> {

	private static final Pattern PAN_PATTERN = Pattern.compile("^[A-Z]{5}[0-9]{4}[A-Z]$");

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.isBlank()) {
            return true; // @NotBlank handles null/empty
        }
        return PAN_PATTERN.matcher(value.toUpperCase()).matches();
	}

}
