package com.cropdeal.farmer_service.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(public * com.cropdeal.farmer_service.controller.FarmerController.getAllFarmers())")
    public void log(){
        System.out.println("GetAllFarmers Called");
    }
}
