package spring.aop.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Pointcut("execution(* spring.aop.*.*.*(..))")
	public void aoppackage() {}

	@Before("aoppackage()")
	public void beforeAddAccountAdvice() {
		
		System.out.println("\nBefore Executions ==========> see again");
	}
	
	@Before("aoppackage()")
	public void APiValidtion() {
		
		System.out.println("\nValidation Before Executions ==========> The Validation Is True");
	}

}
