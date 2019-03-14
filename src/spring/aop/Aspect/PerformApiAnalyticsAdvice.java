package spring.aop.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(0)
public class PerformApiAnalyticsAdvice {
	
	//@Before("spring.aop.Aspect.HelperMethodsOfAspect.AopPackageNoSetterOrGetter()")
	public void APiValidtion(JoinPoint joinPoint) {
		System.out.println("\nValidation Before Executions ==========> The Validation Is True");
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		System.out.println("Method = "+signature);
	}
	
}
