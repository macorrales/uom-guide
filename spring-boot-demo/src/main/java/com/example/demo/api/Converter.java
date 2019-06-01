package com.example.demo.api;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import tech.units.indriya.quantity.Quantities;
import tech.units.indriya.unit.Units;

import javax.measure.*;

@Component
public class Converter {

    public String convertService(Integer amount, String fromUnit, String fromPrefix, String toUnit, String toPrefix) throws IncommensurableException {
        Unit<?> sourceUnit = Units.getInstance().getUnit(fromUnit);
        if (!StringUtils.isEmpty(fromPrefix)) {
            sourceUnit = sourceUnit.prefix(MetricPrefix.valueOf(fromPrefix));

        }
        Unit<?> destinationUnit = Units.getInstance().getUnit(toUnit);
        if (!StringUtils.isEmpty(toPrefix)) {
            destinationUnit = destinationUnit.prefix(MetricPrefix.valueOf(toPrefix));
        }
        UnitConverter converter = sourceUnit.getConverterToAny(destinationUnit);
        Number convert = converter.convert(amount);
        Quantity<?> quantity = Quantities.getQuantity(convert, destinationUnit);


        return quantity.toString();
    }

}
