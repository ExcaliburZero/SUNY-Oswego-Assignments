/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab05;

// Imports
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author cwells2
 */
public class CMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // Declare and initialize variables
        String line;
        int lineNum = 0;
        
        // Create file and scanner objects
        File input = new File("myfile.txt");
        Scanner sc = new Scanner(input);
        
        // Read each line from the file
        while(sc.hasNextLine()) {
            // Read the next input line
            line = sc.nextLine();
            
            // Record that there is another input line
            lineNum += 1;
            
            // Print out the line number and the line in all caps
            System.out.println(lineNum + " : " + line.toUpperCase());
        }
        
        // Notify the user that the end of the file has been reached
        System.out.println("End of file reached");
    }
    
}
