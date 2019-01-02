package aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Howl
 * Aop织入，所谓织入，则是指增强一个类原有的方法。
 *
 */
@Component
@Aspect
public class AopZR {
	
	@Before("execution(* demo.*.*(..))")
	public void before() {
		System.out.println("指定方法執行前");
	}
	
	@After("execution(* demo.*.*(..))")
	public void after() {
		System.out.println("指定方法執行后");
	}
}
