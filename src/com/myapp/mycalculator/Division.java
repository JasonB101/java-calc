package com.myapp.mycalculator;

public class Division extends CalcBase {

    public Division(char operator, double firstValue, double secondValue){
        super(operator, firstValue, secondValue);

        calculate();
    }

    @Override
    public void calculate() {
        double divisor = getSecondValue();
        double value = divisor != 0 ? getFirstValue() / divisor : 0;
        setResult(value);
    }

}