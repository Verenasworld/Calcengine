package com.calcengine;

public class Main {

    //build a system that's able to perform a variety of mathematical calculations.
    public static void main(String[] args) {

        double value1 = 100.0d;
        double value2 = 0.0d;
        double result = 0.0d;
        char opCode = 'd';


        switch (opCode){
            case 'a' :
                result = value1 + value2;
                break;
            case  's' :
                result = value1 - value2;
                break;
            case 'm':
                result = value1 * value2;
                break;
            case 'd':
                    result = value2 != 0 ?value1 / value2 : 0.0d ;
                break;

            default:
                System.out.println("invalid opCode: " + opCode);
                result = 0.0d;
                break;
            }
            // you can do it with a shorter way arrow function using switch (opCode) {
        //            case 'a' -> result = value1 + value2;
        //            case 's' -> result = value1 - value2;
        //            case 'm' -> result = value1 * value2;
        //            case 'd' -> result = value2 != 0 ? value1 / value2 : 0.0d;
        //            default -> {
        //                System.out.println("invalid opCode: " + opCode);
        //                result = 0.0d;
        //            }
        //

        System.out.println(result);

    }
}
