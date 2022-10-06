/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mycalculator;

/**
 *
 * @author jcls1987 10/06/2022 Simple Calculator that adds, subracts,
 * multiplies, divides and provides the remainder with modulo. Codecademy
 * Project
 */
public class MyCalculator {

    
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        System.out.println(myCalculator.add(5, 7));//Short way of printing outcome

        int subtraction = myCalculator.subtract(45, 11);
        System.out.println(subtraction);//This is the long way of printing the outcome

        System.out.println(myCalculator.multiply(2, 8));//Multiply

        System.out.println(myCalculator.divide(8, 2));//division

        System.out.println(myCalculator.modulo(13, 12));//Remainder
    }
}


