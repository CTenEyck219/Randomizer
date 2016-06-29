/**
 * Created by: Cameron Wildey
 * Date: 06/07/2016
 */

import java.util.ArrayList;
import java.util.Random;
import java.io.*;
import javax.swing.*;

public class GetRandom {
    
    //initiating attributes
    public String targetArt;
    public int count = 0;
    
    public GetRandom() {
        
        selectRandomArt();
        
    }
    
    public GetRandom(String target) {
        
        targetArt = target;
        
    }
    
    /**
     * Method for reading in text file and adding it to an array named 
     * pick random art to be used in other methods
     */
    public void selectRandomArt() {
        
        int which;
        int counter = 0;
        String fileName = "Art.txt";
        ArrayList<String> pickRandomArt = new ArrayList<String>();
        
        try {
            
            //creates fileReader object
            FileReader inputFile = new FileReader(fileName);
            
            //create an instance of BufferedReader
            BufferedReader bufferReader = new BufferedReader(inputFile);
            
            //variable to hold lines in the file
            String art = new String();
            
            //read file line by line and add to the pickRandomArt Array
            while((art = bufferReader.readLine()) != null) {
                pickRandomArt.add(art);
                ++counter;
            }//end of while loo
            
            //close buffer reader
            bufferReader.close();
            
            which = (int) (Math.random() * counter);
            
            targetArt = pickRandomArt.get(which);
            
        }//end of try
        
        catch(FileNotFoundException e) {
            
            JOptionPane.showMessageDialog(null, "Unable to open file '" +
                    fileName + " ' ", "Error", 
                    JOptionPane.INFORMATION_MESSAGE, null);
        
        }//end of file not found catch
        
        catch(Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error while reading in file '" 
                    + fileName + " ' ", "Error", 
                    JOptionPane.INFORMATION_MESSAGE, null);
        }//end of read in error
        
    }//end of selectRandomArt
    
    public String getTargetArt() {
        
        return targetArt;
        
    }//end of getter
    
}//end of GetRandom class 