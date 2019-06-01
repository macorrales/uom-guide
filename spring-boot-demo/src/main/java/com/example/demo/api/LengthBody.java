package com.example.demo.api;

import java.math.BigDecimal;

public class LengthBody {
    String unit;
    BigDecimal amount;

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}

