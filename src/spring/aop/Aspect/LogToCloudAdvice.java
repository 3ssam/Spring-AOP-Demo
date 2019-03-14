package spring.aop.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import spring.aop.models.Account;

@Aspect
@Component
@Order(90)
public class LogToCloudAdvice {
	
	@Before("spring.aop.Aspect.HelperMethodsOfAspect.AopPackageNoSetterOrGetter()")
	public void CloudValidtion(JoinPoint joinPoint) {
		System.out.println("\nStarting Cloud ==========> The Cloud Is Run Now");
		Object[] objects = joinPoint.getArgs();
		for (Object arg : objects) {
			System.out.println(arg);
			if (arg instanceof Account)
			{
				Account accountObj = (Account) arg;
				System.out.println("Account name = "+accountObj.getName());
				System.out.println("Account level = "+accountObj.getLevel());
			}

		}
	}

}
