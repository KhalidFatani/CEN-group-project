/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cengame;

import java.util.Random;

/**
 *
 * @author bluty
 */
public class CENgame {

    /**
     * main method will call other methods from all classes.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CENgame cg = new CENgame(); //new instance of the program for better runtime
        int[] numbers = new int[6]; //will be filled with random numbers to generate the colors
        String[] colors = new String[6]; // will hold the colors that the user must guess
        
        cg.generateNumbers(numbers); //method call to generate numbers randomly
        colors = cg.numToColor(numbers); // method call to convert the numbers ^^ into colors
        System.out.println(colors[0] + colors[1] + colors[2] + colors[3] + colors[4] + colors[5]); //remove comment to see correct colors.
        Game game = new Game(); //new game instance
        game.playGame(colors); //starts the game and passes the colors
    }
    
    /**
     * generates random numbers
     * @param a
     * @return 
     */
    public int[] generateNumbers(int[] a)
    {
        Random ran = new Random();
        
        for(int i = 0; i < a.length; i++)
        {
            a[i] = ran.nextInt(1,7);
        }
        
        
        return a;
    }
    
    /**
     * converts numbers to colors
     * @param a
     * @return 
     */
    public String[] numToColor(int[] a)
    {
        String[] b = new String[6];
        
        for(int i=0; i<6; i++)
        {
            if(a[i] == 1)
            {
                b[i] = "Red";
            }
            
            else if(a[i] == 2)
            {
                b[i] = "Blue";
            }
            
            else if(a[i] == 3)
            {
                b[i] = "Green";
            }
            
            else if(a[i] == 4)
            {
                b[i] = "Yellow";
            }
            
            else if(a[i] == 5)
            {
                b[i] = "Purple";
            }
            
            else if(a[i] == 6)
            {
                b[i] = "Orange";
            }
        }
        
        return b;
    }
}
