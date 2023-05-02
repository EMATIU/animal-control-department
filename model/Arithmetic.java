package model;

import java.math.BigDecimal;

public class Arithmetic {

    public Double add(Double a, Double b){
        return BigDecimal.valueOf(a).add(BigDecimal.valueOf(b)).doubleValue();
    }

    public Double substract(Double a, Double b){
        return BigDecimal.valueOf(a).subtract(BigDecimal.valueOf(b)).doubleValue();
    }

    public Double multiply(Double a, Double b){
        return BigDecimal.valueOf(a).multiply(BigDecimal.valueOf(b)).doubleValue();
    }

    public Double divide(Double a, Double b){
        return BigDecimal.valueOf(a).divide(BigDecimal.valueOf(b)).doubleValue();
    }

}