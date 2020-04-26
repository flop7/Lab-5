/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labquestion1;
import java.util.Scanner;
/**
 *
 * @author ahmad
 */

public class LabQuestion1 {
  
    

    public static void main(String[] args) {
        // TODO code application logic here
        int grade = 0;
int nbofstudents = 0;

//Initializing variables
int numberofgrades = 0;


double result = 0;

Scanner sc = new Scanner(System.in);
System.out.println("Please enter the total number of Students: ");
nbofstudents = sc.nextInt();
        
      for (int i = 0; i < nbofstudents; i++) {
            System.out.println("Please enter number of grades for Student: ");	       
            for (int j=0; j < numberofgrades; j++) {
                System.out.println("Please enter Student;s grade:");
                grade = sc.nextInt();

                if (grade < 0 || grade > 100) {
                    System.out.println("Grade must be between 0 and 100");
                    grade = sc.nextInt();
                }
             
                while (grade >= 0 && grade <= 100) {

                    int highest = 0;            
                    int lowest = 0;             
                    double average = 0;         
                     
                    //Highest grade
                    if (grade > highest) {
                        highest = grade;
                    }
                    
                    //Lowest grade
                    if (grade < lowest) {
                        lowest = grade;
                    }
                    result += grade;
             
                average = (result/numberofgrades);
                 
                System.out.println("The highest grade is " + highest);
                System.out.println("The lowest grade is " + lowest);
                System.out.println("The average grade is " + average);
                }
            }
      }
    }
}
                
            
    
	
    
    
    

