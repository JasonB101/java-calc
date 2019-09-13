package com.myapp.mycalculator;

public class Addition extends CalcBase {

    public Addition(char operator, double firstValue, double secondValue){
        super(operator, firstValue, secondValue);

        calculate();
    }

    @Override
    public void calculate() {
        double value = getFirstValue() + getSecondValue();
        setResult(value);
    }

}
