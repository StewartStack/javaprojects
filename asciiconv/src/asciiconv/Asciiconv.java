/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asciiconv;

/**
 *
 * @author jcls1987
 * asciiconverions | Learn Java | Codecademy 
 * 10/1/2022
 */

import java.util.Scanner;
public class Asciiconv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Please enter a character: ");//using print instead of println so that what the user types is on the same line as the prompt
        String myString=userInput.nextLine();
        //the charAt(i) method allows us to upll a single character from the a string where i is the position of the char we want
        //here we are casting the character to an int. Note we don't need to explicitly
        int asciiVal = myString.charAt(0);
        char nextChar = (char)(asciiVal+1);//here we are casting and int into to a char. Note that we need to explicitly state that we want it as a char using (char)
        System.out.println("The ascii value of this is : "+asciiVal);
        System.out.println("The next character is "+nextChar);
        
    }
    
}
