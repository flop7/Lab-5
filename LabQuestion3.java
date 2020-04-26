/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labquestion3;

/**
 *
 * @author ahmad
 */
public class LabQuestion3 {

   

        //Initializing private variables
        private int ISBN;
        private String title;
        private String author;
        private int YearOfPublishing;
        private String publisher;
        int amountOfBooks= 0;
        

        //Getter and Setter methods
        public int getISBN() {
            return ISBN;
        }

        public String gettitle() {
            return title;
        }
        
        public String getpublisher()
        {
        return publisher;
        }
        

        public String getauthor() {
            return author;
        }

        public int getYearOfPublishing() {
            return YearOfPublishing;
        }

        public void setISBN(int newValue) {
            ISBN = newValue;
        }

        public void settitle(String newValue) {
            title = newValue;
        }

        public void setauthor(String newValue) {
            author = newValue;
        }

        public void setYearOfPublishing(int newValue) {
            YearOfPublishing = newValue;
        }
        public void setPublisher(String Vanier)
        {
            publisher= Vanier;
        }
   
   
    public String toString() {  
        return ISBN + " " + author + " " + title + " " + YearOfPublishing;
    }

    public static void main(String[] args) {
        // TODO code application logic here

        //Loop to increment amountOfBooks by 1    
        for(int amountOfBooks=0;amountOfBooks<100;amountOfBooks++)
    {
        System.out.println("+1 Book");
    }
       
        //Test to output the author,title and ISBN of a book
        LabQuestion3 obj = new LabQuestion3();
        obj.setauthor("Eren");
        obj.settitle("Love you");
        obj.setISBN(13446);
        System.out.println("Title of book: " + obj.gettitle());
        System.out.println("Author: " + obj.getauthor());
        System.out.println("ISBN: " + obj.getISBN());

    }

}
 



