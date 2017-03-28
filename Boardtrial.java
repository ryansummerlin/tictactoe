
/**
 * Write a description of class boardtrial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boardtrial
{
    public int ROWS = 3;
    public int COLS = 3;
    
    
    public Boardtrial() {
        
    }
   
    public void createB(){
         for (int i = 0; i < 3; i++)
            System.out.println("");
        
        displayB();
        displayB();
        System.out.println("    |     | ");
            
        
    }
    // instance variables - replace the example below with your own
       public void displayB() 
   {  
    for (int i = 0; i < 1; i++)
        System.out.println("    |     | ");
        for (int p=0; p < 1 ; p++)
            System.out.println ( "---------------- ");
            
  
   }
}

