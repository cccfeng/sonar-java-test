package com.example.demo.model;

import org.junit.Test;

public class ExampleData2Test {

    @Test
    public void testExampleData2(){
        ExampleData2 exampleData2 = ExampleData2.builder().msg("hello").build();
        System.out.println(exampleData2);
    }
}
