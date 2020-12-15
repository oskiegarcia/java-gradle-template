package com.oscar.app;

public class App {
    private final DependentInterface dependency;

    public App(DependentInterface dependency) {
        this.dependency = dependency;
    }

    public String sayHello() {
        return dependency.getData();
    }
}
