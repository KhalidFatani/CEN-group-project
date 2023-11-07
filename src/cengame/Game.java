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
    int red = 0, blue = 0, green = 0, yellow = 0, purple = 0, orange = 0;
    
    /**
     * runs the game
     * @param colors 
     */
    public void playGame(String[] colors)
    {
        String[] userColors = new String[6]; //will hold user's guesses
        int run = 1;
        boolean complete = false;
        
        
        //method call to check how many of each color
        colorCount(colors);
        
        //loop that runs until game is over (all guesses are correct, or number of tries run out)
        while(!complete && run < 7)
        {
            System.out.println("Run " + run);
            userColors = getUserColors(colors); // method call to get user's guesses  
            
            for (int i = 0; i < 6; i++)
            {
                System.out.print("Slot " + (i + 1) + ": ");

                if (userColors[i].equalsIgnoreCase(colors[i])) //if correct guess
                {
                    System.out.println("correct");
                    
                    //update counter for current color to track how many are left
                    if(userColors[i].equalsIgnoreCase("Red"))
                    {
                        red--;
                    }
                    
                    else if(userColors[i].equalsIgnoreCase("Blue"))
                    {
                        blue--;
                    }
                    
                    else if(userColors[i].equalsIgnoreCase("Green"))
                    {
                        green--;
                    }
                    
                    else if(userColors[i].equalsIgnoreCase("Yellow"))
                    {
                        yellow--;
                    }
                    
                    else if(userColors[i].equalsIgnoreCase("Purple"))
                    {
                        purple--;
                    }
                    
                    else if(userColors[i].equalsIgnoreCase("Orange"))
                    {
                        orange--;
                    }
                }

                else
                {
                    //checking if that colors is in the answer and then giving output of wrong spot or incorrect
                    if (userColors[i].equalsIgnoreCase("Red") && red > 0)
                    {
                        System.out.println("wrong spot");
                    }
                    
                    else if(userColors[i].equalsIgnoreCase("Blue") && blue > 0)
                    {
                        System.out.println("wrong spot");
                    }
                    
                    else if(userColors[i].equalsIgnoreCase("Green") && green > 0)
                    {
                        System.out.println("wrong spot");
                    }
                    
                    else if(userColors[i].equalsIgnoreCase("Yellow") && yellow > 0)
                    {
                        System.out.println("wrong spot");
                    }
                    
                    else if(userColors[i].equalsIgnoreCase("Purple") && purple > 0)
                    {
                        System.out.println("wrong spot");
                    }
                    
                    else if(userColors[i].equalsIgnoreCase("Orange") && orange > 0)
                    {
                        System.out.println("wrong spot");
                    }
                    
                    else System.out.println("incorrect"); //if incorrect guess and not in the answer
                }
            }
            System.out.println("");
            
            //checking if game is complete, if all colors match, boolean complete is set to true which ends the game.
            if(userColors[0].equalsIgnoreCase(colors[0]) && userColors[1].equalsIgnoreCase(colors[1]) && userColors[2].equalsIgnoreCase(colors[2]) 
                    && userColors[3].equalsIgnoreCase(colors[3]) && userColors[4].equalsIgnoreCase(colors[4])
                    && userColors[5].equalsIgnoreCase(colors[5])) complete = true;
            
            run++;
        }
        
        if(complete) System.out.println("\nYou won!"); // if user won, this will be displayed
        else 
        {
            System.out.println("\nHere are the correct colors");
            printColors(colors); //method call to print correct colors
        }
        
    }
    /**
     * counts number of each color
     * @param colors 
     */
    public void colorCount(String[] colors)
    {
        for(int i = 0; i < 6; i++)
        {
            if(colors[i].equalsIgnoreCase("Red"))
            {
                red++;
            }
                    
            else if(colors[i].equalsIgnoreCase("Blue"))
            {
                blue++;
            }
                    
            else if(colors[i].equalsIgnoreCase("Green"))
            {
                green++;
            }
                    
            else if(colors[i].equalsIgnoreCase("Yellow"))
            {
                yellow++;
            }

            else if(colors[i].equalsIgnoreCase("Purple"))
            {
                purple++;
            }

            else if(colors[i].equalsIgnoreCase("Orange"))
            {
                orange++;
            }
        }
    }
    
    /**
     * gets guess from user
     * @param colors
     * @return 
     */
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
    
    /**
     * prints the correct colors
     * @param colors 
     */
    public void printColors(String[] colors)
    {
        for(int i = 0; i < colors.length; i++)
        {
            System.out.print(colors[i] + " ");
        }
    }
}
