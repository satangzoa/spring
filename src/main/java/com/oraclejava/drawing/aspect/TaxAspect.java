package com.oraclejava.drawing.aspect;

import org.aspectj.lang.annotation.*;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TaxAspect {
	
	@AfterReturning(pointcut = "execution(public String getName())", returning = "name")
	public void loggingAdvice(String name) {
		System.out.println("세금포함 금액" + name + " 원입니다.");
	}
	
	
}
