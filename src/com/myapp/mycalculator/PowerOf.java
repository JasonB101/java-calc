package com.myapp.mycalculator;

public class PowerOf extends CalcBase {

    public PowerOf(char operator, double firstValue, double secondValue){
        super(operator, firstValue, secondValue);

        calculate();
    }

    @Override
    public void calculate() {
        double value = Math.pow(getFirstValue(), getSecondValue());
        setResult(value);
    }

}