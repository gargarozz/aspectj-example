package it.imolinfo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Definisco un pointcut (tutti i metodi annotati con @TestModeOnly) e un advice che
 * lancia un'eccezione se non è presente la system property test.mode.enabled=true
 *
 */
@Aspect
public class TestModeOnlyAspect {
    @Pointcut("execution(@it.imolinfo.TestModeOnly * *(..))")
    public void testModeOnlyMethods() {
    }

    @Before("testModeOnlyMethods()")
    public void testModeOnly(JoinPoint joinPoint) {
        if (!Boolean.getBoolean("test.mode.enabled")) {
            throw new TestModeOnlyException(joinPoint.toString());
        }
    }
}
