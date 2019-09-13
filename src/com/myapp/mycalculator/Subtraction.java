package com.myapp.mycalculator;

public class Subtraction extends CalcBase {

    public Subtraction(char operator, double firstValue, double secondValue){
        super(operator, firstValue, secondValue);

        calculate();
    }

    @Override
    public void calculate() {
        double value = getFirstValue() - getSecondValue();
        setResult(value);
    }

}