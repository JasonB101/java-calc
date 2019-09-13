package com.myapp;

import com.myapp.mycalculator.Addition;
import com.myapp.mycalculator.Subtraction;
import com.myapp.mycalculator.Multiplication;
import com.myapp.mycalculator.Division;
import com.myapp.mycalculator.PowerOf;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first value: ");
        double firstValue = input.nextDouble();
        System.out.print("Enter operation character (+ - * / ^):  ");
        char operation = input.next().charAt(0);
        System.out.print("Enter second value: ");
        double secondValue = input.nextDouble();

            switch(operation){
                case '+':
                    new Addition(operation, firstValue, secondValue).printResult();
                    break;
                case '-':
                    new Subtraction(operation, firstValue, secondValue).printResult();
                    break;
                case '*':
                    new Multiplication(operation, firstValue, secondValue).printResult();
                    break;
                case '/':
                    new Division(operation, firstValue, secondValue).printResult();
                    break;
                case '^':
                    new PowerOf(operation, firstValue, secondValue).printResult();
                    break;
                default:
                    System.out.println("That was not a valid operation!");
            }

    }
}
