package com.restful.jersey.service;

import service.StudentService;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Application class to configure scanning of service classes
 * User: Anish
 * Date: 9/18/12
 * Time: 3:11 PM
 */
public class MyApplication extends Application {
    public Set<Class<?>> getClasses() {
        System.out.println("@@@@@@@@@@###############$$$$$$$$$$$$$");
        Set<Class<?>> serviceClasses = new HashSet<Class<?>>();
        serviceClasses.add(StudentService.class);
        return serviceClasses;
    }
}
