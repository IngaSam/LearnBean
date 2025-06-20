package org.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
 /*   @Before("execution(* org.example.TaskManager.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Перед вызовом метода: " + methodName);
    }

    @AfterReturning(value = "execution(* org.example.TaskManager.*(..))",
                        returning = "result"
                        )
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
       System.out.println("После возвращени результата: " +
               joinPoint.getSignature().getName()+ " результат = "+ result);
    }

    @AfterThrowing(
            value = "execution(* org.example.TaskManager.*(..))",
            throwing = "exc")
    public void afterAfterThrowing(JoinPoint joinPoint, Exception exc) {
            System.out.println("После исключения: " + exc.getMessage());
    }
    @After("execution(* org.example.TaskManager.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("После выполнения метода: " + joinPoint.getSignature().getName());
    }*/
/*    @Around("execution(* org.example.TaskManager.*(..))")
    public Object logAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("До метода ");
        Integer result =(Integer) proceedingJoinPoint.proceed();
        System.out.println("После метода ");
        return result/2;
    }*/
    @Before("@annotation(loggable)")
    public void log(
            JoinPoint joinPoint,
            Loggable loggable
    ) {
        for (int i=0; i< loggable.times(); i++) {
            System.out.printf("Logging %s: before method = %s \n", loggable.value(), joinPoint.getSignature().getName()
            );
        }
    }

}
