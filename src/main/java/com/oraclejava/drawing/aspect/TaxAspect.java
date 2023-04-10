package com.oraclejava.drawing.aspect;

import java.beans.BeanProperty;

import org.aspectj.lang.annotation.*;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TaxAspect {
	
	@AfterReturning(pointcut = "execution(public String getTax())", returning = "tax")
	public void loggingAdvice(String tax) {
		System.out.println("�������� �ݾ�: " + tax + " ���Դϴ�.");
	}
	
	
}
