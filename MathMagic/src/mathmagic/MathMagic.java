/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathmagic;

/**
 *
 * @author jcls1987
 * 10/05/2022
 * This is a project done on Codecademy Learn Java course.
 */
public class MathMagic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int myNumber = 36;//This is the original number we will refer to in this project.
        
        int stepOne = myNumber * myNumber;
        //System.out.println(stepOne);
        int stepTwo = stepOne + myNumber;
        //System.out.println(stepTwo);
        int stepThree = stepTwo / myNumber;
        //System.out.println(stepThree);
        int stepFour = stepThree + 17;
        //System.out.println(stepFour);
        int stepFive = stepFour - myNumber;
        //System.out.println(stepFive);
        int stepSix = stepFive / 6;
        System.out.println(stepSix);
        
        //This will print out exactly the same as above.
        int magicNumber = myNumber * myNumber;
        magicNumber += myNumber;
        magicNumber /= myNumber;
        magicNumber += 17;
        magicNumber -= myNumber;
        magicNumber /= 6;
        System.out.println(magicNumber);
    }

}
