package spring.aop.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelperMethodsOfAspect {
	
	@Pointcut("execution(* spring.aop.*.*.*(..))")
	public void aoppackage() {}
	
	@Pointcut("execution(* spring.aop.*.*.set*(..))")
	public void setter() {}

	@Pointcut("execution(* spring.aop.*.*.get*(..))")
	public void getter() {}

	@Pointcut("aoppackage() && !(setter() || getter())")
	public void AopPackageNoSetterOrGetter() {}
		
}
