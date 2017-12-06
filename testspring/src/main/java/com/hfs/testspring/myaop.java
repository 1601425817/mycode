package com.hfs.testspring;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class myaop {
	
	@Pointcut("execution(* com.hfs.testspring.MediaPlayer.*(..))")
	public void mplay() {
		
	}
	
	@Before("mplay()")
	public void set()
	{
		System.out.println("i am set");
	}

	@After("mplay()")
	public void a()
	{
		System.out.println("after");
	}
}
