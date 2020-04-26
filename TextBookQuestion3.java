/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textbookquestion3;

/**
 *
 * @author ahmad
 */
public class TextBookQuestion3 {
     
    
     private String coursename;
     private double lettergrade;
        
        
        

        //Getter and Setter  
        
        public String getcoursename()
        {
        return coursename;
        }
        
        public double getlettergrade()
        {
        return lettergrade;
        }

        

     
        public void setcoursename(String newValue)
        {
            coursename= newValue;
        }
        
         public void setlettergrade(double newValue)
        {
            lettergrade= newValue;
        }
        
        public String toString() {  
        return coursename + " "+ lettergrade +" ";
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         TextBookQuestion3 obj = new TextBookQuestion3();
        obj.setcoursename("Arts");
        obj.setlettergrade(80);
        
        System.out.println("Course name :" + obj.getcoursename());
        System.out.println("letter grade :" + obj.getlettergrade());
    }
    
}
