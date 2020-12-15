package com.oscar.app;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MainTest {

    @Test
    void shouldReturnAppObjectWhenNewInstanceIsCalled() {
        DependentInterface stubDependency = mock(DependentInterface.class);
        when(stubDependency.getData()).thenReturn("hi");

        App app = new App(stubDependency);
        assertEquals("hi", app.sayHello());
    }

}
