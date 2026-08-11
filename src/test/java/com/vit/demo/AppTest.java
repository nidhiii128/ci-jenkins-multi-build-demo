package com.vit.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testAdd() {
        int expected = 5;
        int actual = App.add(2, 3);

        assertEquals(expected, actual);

        System.out.println("TEST PASSED: App.add(2, 3) returned 5.");
    }
}