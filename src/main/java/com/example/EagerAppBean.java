package com.example;

import io.quarkus.runtime.Startup;

import javax.enterprise.context.ApplicationScoped;

@Startup
@ApplicationScoped
public class EagerAppBean {

    private final String name;

    EagerAppBean() {
        this.name = EagerAppBean.class.getName();
        System.out.println("*****************"+name+"*****************");
    }
}