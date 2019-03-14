package spring.aop.Aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import spring.aop.models.Account;

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
	
	@AfterReturning ( pointcut="execution(* spring.aop.DAOS.AccountDAO.getAllData(..))"
			,returning="result")
	public void beforeAddAccountAdvice(JoinPoint joinPoint
			,List<Account> result) {
		System.out.println("\nAfter Executions ==========> \nresult is "+result);
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		System.out.println("Method = "+signature);
	}

	
}
