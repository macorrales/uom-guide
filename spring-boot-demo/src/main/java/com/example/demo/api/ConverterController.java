package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.measure.IncommensurableException;

@RestController()
public class ConverterController {

    private final Converter converter;

    @Autowired
    public ConverterController(Converter converter) {
        this.converter = converter;
    }

    @GetMapping("/measurement/{amount}/{fromUnit}/to/{toUnit}")
    String convert(@PathVariable Integer amount, @PathVariable String fromUnit, @RequestParam (required = false)String  fromPrefix, @PathVariable String toUnit, @RequestParam (required = false) String toPrefix) throws IncommensurableException {
            return converter.convertService(amount, fromUnit, fromPrefix, toUnit, toPrefix);
    }


}
