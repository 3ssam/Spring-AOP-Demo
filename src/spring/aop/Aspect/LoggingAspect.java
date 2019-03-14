package spring.aop.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(-2)
public class LoggingAspect {
	
	@Before("spring.aop.Aspect.HelperMethodsOfAspect.AopPackageNoSetterOrGetter()")
	public void beforeAddAccountAdvice(JoinPoint joinPoint) {
		System.out.println("\nBefore Executions ==========> see again");
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		System.out.println("Method = "+signature);
	}
	
}
