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
       results[i] = execute(opCodes[i], leftVals[i], rigthVals[i]);
      }

      for(double currentResult : results) //for-each loop
        System.out.println(currentResult);
    }

    //Method

   static double execute(char opCode,double leftVal, double rightVal){
        double result;
       switch (opCode){
           case 'a' :
               result = leftVal + rightVal;
               break;
           case  's' :
               result = leftVal - rightVal;
               break;
           case 'm':
               result = leftVal * rightVal;
               break;
           case 'd':
               result = rightVal != 0 ?leftVal/ rightVal : 0.0d ;
               break;

           default:
               System.out.println("invalid opCode: " + opCode);
               result = 0.0d;
               break;
       }
       return result;
   }
}
