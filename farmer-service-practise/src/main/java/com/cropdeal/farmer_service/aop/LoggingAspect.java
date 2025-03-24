package com.cropdeal.farmer_service.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class) ;
    @Before("execution(public * com.cropdeal.farmer_service.controller.FarmerController.getAllFarmers())")
    public void log(){
        LOGGER.info("GetAllFarmers Called");
    }
}
