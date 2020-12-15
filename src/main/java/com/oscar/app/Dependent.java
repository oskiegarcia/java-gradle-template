package com.oscar.app;

public class Dependent implements DependentInterface {

    @Override
    public String getData() {
        return "hello";
    }
}
