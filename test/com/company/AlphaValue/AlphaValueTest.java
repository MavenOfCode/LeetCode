package com.company.AlphaValue;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class AlphaValueTest {

    @Test
    public void alphaValueTest() {

        Map<String, Integer> result = AlphaValue.alphaValue();

        System.out.println(result.toString());
    }
}