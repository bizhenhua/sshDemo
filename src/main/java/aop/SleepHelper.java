package aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class SleepHelper implements MethodBeforeAdvice, AfterReturningAdvice {

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("睡觉前要敷面膜");
	}

	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("睡觉后要做美梦");
	}

}