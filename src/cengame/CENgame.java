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
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CENgame cg = new CENgame();
        int[] numbers = new int[6];
        String[] colors = new String[6];
        
        cg.generateNumbers(numbers); 
        colors = cg.numToColor(numbers);
        //System.out.println(colors[0] + colors[1] + colors[2] + colors[3] + colors[4] + colors[5]); //remove comment to see correct colors.
        Game game = new Game();
        game.playGame(colors);
    }
    
    public int[] generateNumbers(int[] a)
    {
        Random ran = new Random();
        
        for(int i = 0; i < a.length; i++)
        {
            a[i] = ran.nextInt(1,7);
        }
        
        
        return a;
    }
    
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
