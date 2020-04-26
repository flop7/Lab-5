/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textbookquestion1;

/**
 *
 * @author ahmad
 */
public class TextBookQuestion1 {
 
        private String teamname;
        
        
        

        //Getter and Setter methods
        
        public String getteamname()
        {
        return teamname;
        }
        

     
        public void setteamname(String newValue)
        {
            teamname= newValue;
        }
        
        public String toString() {  
        return teamname;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         TextBookQuestion1 obj = new TextBookQuestion1();
        obj.setteamname("Orioles");
        
        System.out.println("Team name " + obj.getteamname());
    }
    
}
