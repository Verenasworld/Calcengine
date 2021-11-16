package com.calcengine;

public class Main {

    //build a system that's able to perform a variety of mathematical calculations.
    public static void main(String[] args) {
        double[] leftVals = {100.0d,25.0d,225.0d,11.0d};
        double[] rigthVals = {50.0d,92.0d,17.0d,3.0d};
        char[] opCodes = {'d','a', 's', 'm'};
        double[] results =  new double[opCodes.length];

        //set up my loop with for
      for(int i = 0; i< opCodes.length; i++){
          switch (opCodes[i]){
              case 'a' :
                  results[i] = leftVals[i] + rigthVals[i];
                  break;
              case  's' :
                  results[i] = leftVals[i] + rigthVals[i];
                  break;
              case 'm':
                  results[i] = leftVals[i] + rigthVals[i];
                  break;
              case 'd':
                  results[i] = rigthVals[i] != 0 ?leftVals[i] / rigthVals[i] : 0.0d ;
                  break;

              default:
                  System.out.println("invalid opCode: " + opCodes[i]);
                  results[i] = 0.0d;
                  break;
          }
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
        for(double currentResult : results) //for-each loop
        System.out.println(currentResult);

    }
}
