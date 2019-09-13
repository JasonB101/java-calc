package com.myapp.mycalculator;

public abstract class CalcBase {
    double firstValue;
    double secondValue;
    char operator;
    double result;

    public CalcBase(){

    }
    public CalcBase(char operator, double firstValue, double secondValue){
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.operator = operator;
    }

    //Getters and Setters
    public void setResult(double result){ this.result = result; }

    public double getFirstValue(){ return this.firstValue; }
    public double getSecondValue(){ return this.secondValue; }
    public double getResult(){ return this.result; }

    public abstract void calculate();

    public void printResult(){
        StringBuilder answer = new StringBuilder(20);
        answer.append(firstValue);
        answer.append(' ');
        answer.append(operator);
        answer.append(' ');
        answer.append(secondValue);
        answer.append(" = ");
        answer.append(result);

        System.out.println(answer);
    }

}
