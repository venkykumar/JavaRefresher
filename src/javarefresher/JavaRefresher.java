/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarefresher;

/**
 *
 * @author venky kumar
 */
public class JavaRefresher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyObj1 obj = new MyObj1();
        obj.display();

        // ... existing code ...
        Calculator calculator = new Calculator();
        double number = 25;
        double result = calculator.calculateSquareRoot(number);
        System.out.println("Square root of " + number + " is " + result);
        // ... existing code ...

        double cubeNumber = 27;
        double cubeResult = calculator.calculateCubeRoot(cubeNumber);
        System.out.println("Cube root of " + cubeNumber + " is " + cubeResult);
    }

}
