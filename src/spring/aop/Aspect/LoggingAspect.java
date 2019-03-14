package spring.aop.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(-2)
public class LoggingAspect {
	
	@Before("spring.aop.Aspect.HelperMethodsOfAspect.AopPackageNoSetterOrGetter()")
	public void beforeAddAccountAdvice() {
		System.out.println("\nBefore Executions ==========> see again");
	}
	
}
