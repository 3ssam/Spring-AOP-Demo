package validations;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EssamValidationConstraintValidator 
	implements ConstraintValidator<EssamValidation, String> {

	private String coursePrefix;
	
	@Override
	public void initialize(EssamValidation theCourseCode) {
		coursePrefix = theCourseCode.value();
	}

	@Override
	public boolean isValid(String theCode, 
						ConstraintValidatorContext theConstraintValidatorContext) {

		boolean result;
		
		if (theCode != null) {
			result = theCode.startsWith(coursePrefix);
		}
		else {
			result = true;
		}
		
		return result;
	}
}
