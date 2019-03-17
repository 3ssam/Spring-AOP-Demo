package spring.aop.Aspect;

import java.util.List;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
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
	public void AfterReturningAccountAdvice(JoinPoint joinPoint
			,List<Account> result) {
		System.out.println("\nAfter Executions ==========> \nresult is "+result);
		ConveretToUpperCase(result);
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		System.out.println("Method = "+signature);
	}

	private void ConveretToUpperCase(List<Account> result) {
		for (Account account : result) {
			String name = account.getName().toUpperCase();
			account.setName(name);
			System.out.println("Name = "+account.getName() + "   Level = "+account.getLevel());
		}
	}

	@AfterThrowing ( pointcut="execution(* spring.aop.DAOS.AccountDAO.getAllData(..))"
			,throwing="ex")
	public void AfterThrowingAccountAdvice(JoinPoint joinPoint
			,Exception ex) {
		System.out.println("\nAfter Exception ==========> \nException is "+ex);
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		System.out.println("Method = "+signature);
	}
	
	@After ("execution(* spring.aop.DAOS.AccountDAO.getAllData(..))")
	public void AfterFinallyAccountAdvice(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		System.out.println("\nAfter Finally ==========> Method is = "+signature);
	}
	
	@Around ("execution(* spring.aop.services.*.getFortune(..))")
	public Object AroundGetFortune(ProceedingJoinPoint point) throws Throwable {
		MethodSignature signature = (MethodSignature) point.getSignature();
		System.out.println("\n@Around ==========> Method is = "+signature);
		long begin = System.currentTimeMillis();
		Object result = null;
		try {
			result = point.proceed();
		} catch (Exception e) {
			throw e; 
		}
		long end = System.currentTimeMillis();
		long duration = end - begin;
		System.out.println("\nDuration is: "+duration/1000.0+" Seconds");
		return result;
	}



	
}
