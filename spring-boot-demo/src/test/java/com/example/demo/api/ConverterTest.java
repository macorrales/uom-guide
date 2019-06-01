package com.example.demo.api;


import org.junit.Test;

import javax.measure.IncommensurableException;

import static org.junit.Assert.assertEquals;

public class ConverterTest {

    Converter converter =new Converter();
    @Test
    public void testMetersToMeters() throws IncommensurableException {

        assertEquals("10 m",converter.convertService(10,"m","" , "m",""));
    }

    @Test
    public void testMeterToKm() throws IncommensurableException {
        assertEquals("1.0 km",converter.convertService(1000,"m","" , "m", "KILO"));

    }

}