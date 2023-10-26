/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cengame;

import java.util.Scanner;

/**
 *
 * @author bluty
 */
public class Game {
    
    Scanner scnr = new Scanner(System.in);
    
    public void playGame(String[] colors)
    {
        String[] userColors = new String[6];
        int run = 1;
        boolean complete = false;
        
        while(!complete && run < 7)
        {
            System.out.println("Run " + run);
            userColors = getUserColors(colors);      
            
            for (int i = 0; i < 6; i++)
            {
                System.out.print("Slot " + (i + 1) + ": ");

                if (userColors[i].equalsIgnoreCase(colors[i]))
                {
                    System.out.println("correct");
                }

                else
                {
                    System.out.println("incorrect");
                }
            }
            System.out.println("");
            
            if(userColors[0].equalsIgnoreCase(colors[0]) && userColors[1].equalsIgnoreCase(colors[1]) && userColors[2].equalsIgnoreCase(colors[2]) 
                    && userColors[3].equalsIgnoreCase(colors[3]) && userColors[4].equalsIgnoreCase(colors[4])
                    && userColors[5].equalsIgnoreCase(colors[5])) complete = true;
            
            run++;
        }
        
        if(complete) System.out.println("\nYou won!");
        else 
        {
            System.out.println("\nHere are the correct colors");
            printColors(colors);
        }
        
    }
    
    public String[] getUserColors(String[] colors)
    {
        String[] userColors = new String[6];
        boolean error;
        do
        {
            error = false;
            try{
                System.out.println("\nColor options: Red, Blue, Green, Yellow, Purple, Orange");

                for(int i = 0; i < 6; i++)
                {
                    System.out.println("Enter your guess for slot " + (i + 1) + ": ");
                    userColors[i] = scnr.nextLine();
                    
                    if(!(userColors[i].equalsIgnoreCase("red")) && !(userColors[i].equalsIgnoreCase("blue")) &&
                            !(userColors[i].equalsIgnoreCase("green")) && !(userColors[i].equalsIgnoreCase("yellow")) &&
                            !(userColors[i].equalsIgnoreCase("purple")) && !(userColors[i].equalsIgnoreCase("orange")))
                    {
                        error = true;
                        throw new Exception("error");
                    }
                }
                System.out.println("");
            }
            catch(Exception e){
                System.out.println("\nThere was an error with your input, try again.");
            }
        }while(error == true);
        
        return userColors;
    }
    
    public void printColors(String[] colors)
    {
        for(int i = 0; i < colors.length; i++)
        {
            System.out.print(colors[i] + " ");
        }
    }
}
