package com.bgw.spring.aop.sample3;

import org.springframework.aop.aspectj.AbstractAspectJAdvice;
import org.springframework.aop.aspectj.AspectInstanceFactory;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;

import java.lang.reflect.Method;

/**
 * HelloAspectJAdvice
 *
 * @author zhibin.bgw
 * @since 2020/08/20 16:50
 */
public class HelloAspectJAdvice extends AbstractAspectJAdvice {


    /**
     * Create a new AbstractAspectJAdvice for the given advice method.
     *
     * @param aspectJAdviceMethod   the AspectJ-style advice method
     * @param pointcut              the AspectJ expression pointcut
     * @param aspectInstanceFactory the factory for aspect instances
     */
    public HelloAspectJAdvice(Method aspectJAdviceMethod, AspectJExpressionPointcut pointcut, AspectInstanceFactory aspectInstanceFactory) {
        super(aspectJAdviceMethod, pointcut, aspectInstanceFactory);
    }

    @Override
    public boolean isBeforeAdvice() {
        return true;
    }

    @Override
    public boolean isAfterAdvice() {
        return false;
    }
}
