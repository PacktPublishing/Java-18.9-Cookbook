package com.packt.cookbook.ch04_functional.a;

import org.junit.Test;

import static org.junit.Assert.*;

public class Chapter04FunctionalTest {

    @Test
    public void source() {
        int i = Chapter04Functional.source().get();
        assertEquals(4, i);
    }

    @Test
    public void after() {
        double d = Chapter04Functional.after().apply(1.);
        assertEquals(11., d, 0.01);
    }

    @Test
    public void before() {
        double d = Chapter04Functional.before().apply(10);
        assertEquals(100., d, 0.01);
    }

    @Test
    public void process() {
        double d = Chapter04Functional.process().apply(1);
        assertEquals(20., d, 0.01);
    }

    @Test
    public void condition() {
        boolean b = Chapter04Functional.condition().test(10.);
        assertTrue(b);
    }

}