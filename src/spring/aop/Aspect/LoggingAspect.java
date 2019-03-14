package spring.aop.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Before("execution(* spring.aop.*.*.*(..))")
	public void beforeAddAccountAdvice() {
		
		System.out.println("Before Executions ==========> see again");
	}
}
