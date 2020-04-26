/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labquestion2;

import java.util.Scanner;

/**
 *
 * @author ahmad
 */
public class LabQuestion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int number1;
        int number2;

        // input numbers
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        number1 = scanner.nextInt();

        if (!number1.hasNextInt()) {
            //Printing an error message in case of wrong data input  (if the user does not enter an integer or number)
            System.out.println("Error, please enter a  number");
            return;
        }

        System.out.print("Enter second number:");
        number2 = scanner.nextInt();
        if (!number2.hasNextInt()) {
            //Printing an error message in case of wrong data input (if the user does not enter an integer or number)
            System.out.println("Error, please enter a  number");
            return;
        }

        //To
        scanner.close();

        while (number1 != number2) {
            if (number1 > number2) {
                number1 = number1 - number2;
            } else {
                number2 = number2 - number1;
            }
        }

        //displaying the result
        System.out.printf("GCD of given numbers is: %d", number2);
    }
}
