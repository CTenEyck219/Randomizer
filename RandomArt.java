/**
 * Created by: Cameron Wildey
 * Date: 06/07/2016
 * Project: This project will intake painting names and numbers of the 
 * paintings from a text file and adds them to an ArrayList. From this 
 * list a single name and number of the painting will be printed to the screen
 * when the "Random" button is pushed. This will be used to set up the first
 * 25 paintings that will be displayed at the launch of W.D Walls.
 */

import javax.swing.*;

public class RandomArt {

    
    public static void main(String[] args) {
        
        boolean done = false;
        
        while(!done) {
            
          getArt();
          
         try {
             String input = JOptionPane.showInputDialog("Do you wish to "
                     + "continue? y/n");
          char answer = Character.toUpperCase(input.charAt(0));
          if(answer == 'N')
              done = true;
         }//end of try 
         catch(StringIndexOutOfBoundsException e) {
             String input = JOptionPane.showInputDialog("Do you wish to "
                     + "continue? y/n");
          char answer = Character.toUpperCase(input.charAt(0));
          if(answer == 'N')
              done = true;
         }//end of catch
         
        }//end of while loop
        
    }//end of main
    
    public static void getArt() {
        
        char inputAt = '9';
        
        GetRandom userRandom = new GetRandom();
        
        JOptionPane.showMessageDialog(null, userRandom.getTargetArt());
        
    }//end of getArt
    
}//end of RandomArt class
