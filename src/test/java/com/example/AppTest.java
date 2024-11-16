package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testAppPassed() {
        String expected = "Hello World!";
        String actual = "Hello World!"; 
        assertEquals(expected, actual);
    }

    @Test
    public void testFail() {
        String expected = "Hello World!";
        String actual = "Goodbye World!";
        assertEquals(expected, actual, "Тест має провалитися, оскільки рядки різні!");
    }
}
