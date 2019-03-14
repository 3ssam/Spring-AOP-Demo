package spring.aop.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Before("execution(* add*(spring.aop.models.Account , ..))")
	public void beforeAddAccountAdvice() {
		
		System.out.println("Before Executions ==========> see again");
	}
}
