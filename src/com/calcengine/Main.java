package com.calcengine;

public class Main {

    //build a system that's able to perform a variety of mathematical calculations.
    public static void main(String[] args) {

        double value1 = 100.0d ;
        double value2 = 50.0d;
        double result;
        char opCode = 'd';


        if(opCode == 'a')
            result = value1 + value2;
        else if( opCode == 's')
            result = value1 - value2;
        else if( opCode == 'm')
            result = value1 * value2;
        else if( opCode == 'd')
            result = value1 / value2;
        else
            result = 0.0d;

        System.out.println(result);
    }
}
