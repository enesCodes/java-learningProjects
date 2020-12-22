package com.company;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return this.firstNumber;
    }
    public double getSecondNumber(){
        return this.secondNumber;
    }
    public void setFirstNumber(double firstNumber){
        this.firstNumber=firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }
    public double getAdditionResult(){

        return getFirstNumber()+getSecondNumber();
    }

    public double getMultiplicationResult(){
        SimpleCalculator calculator = new SimpleCalculator();
        double multiply = calculator.getFirstNumber()*calculator.getSecondNumber();
        return multiply;
    }
    public double getDivisionResult(){
        SimpleCalculator calculator = new SimpleCalculator();
        if(calculator.getSecondNumber()==0)return 0;
        double divide = calculator.getFirstNumber()/calculator.getSecondNumber();
        return divide;

    }
}
