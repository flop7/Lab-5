/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textbookquestion2;

/**
 *
 * @author ahmad
 */
public class TextBookQuestion2 {

    /**
     * @param args the command line arguments
     */
     private String brand;
     private double price;
        
        
        

        //Getter and Setter methods
        
        public String getbrand()
        {
        return brand;
        }
        
        public double getprice()
        {
        return price;
        }

        

     
        public void setbrand(String newValue)
        {
            brand= newValue;
        }
        
         public void setprice(double newValue)
        {
            price= newValue;
        }
        
        public String toString() {  
        return brand + " "+ price +" ";
    }
    public static void main(String[] args) {
        // TODO code application logic here
        TextBookQuestion2 obj = new TextBookQuestion2();
        obj.setbrand("Panorama");
        obj.setprice(950);
        
        System.out.println("TV Brand :" + obj.getbrand());
        System.out.println("price :" + obj.getprice());
    }
    
}
