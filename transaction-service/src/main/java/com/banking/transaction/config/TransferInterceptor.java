package com.banking.transaction.config;


import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class TransferInterceptor implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {

    }
}
