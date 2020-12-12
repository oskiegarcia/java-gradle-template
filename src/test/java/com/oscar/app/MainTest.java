package com.oscar.app;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MainTest {

    @Test
    void shouldReturnAppObjectWhenNewInstanceIsCalled(){
        App app = new App();
        assertNotNull(app);
    }

}
