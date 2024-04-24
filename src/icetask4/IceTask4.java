/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package icetask4;

import static java.lang.Integer.parseInt;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Thabo Setsubi st10445734@vcconnnect.edu.za ST10445734
 */
public class IceTask4
{

    //--------------------------------------------------------------------------
    //This is the main method
    public static void main(String[] args)
    {
        int option;
        int exit = 4;
        boolean isRun = true;
        String userString;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to StringToolBox");
        
        while(isRun) 
        {
           try 
           {
                System.out.println("Menu: ");
                System.out.println("1. Manipulate Characters");
                System.out.println("2. Apply Various String Methods");
                System.out.println("3. Convert String Objects to Numbers");
                System.out.println("4. Exit");

                System.out.println("Enter your option: ");
                option = scanner.nextInt();

                switch (option) 
                {
                    case 1:
                        manipulateString();
                        break;
                    case 2:
                        applyStringOptions();
                        break;
                    case 3:
                        convertStringToNumbers();
                        break;
                    case 4:
                        System.out.println("Goodbye! Have a Great Time");
                        isRun = false;
                }
           }
           catch(InputMismatchException e) 
           {
               System.out.println("Error!!! \nYour selection can only be an integer!!!");
               option = scanner.nextInt();
               continue;
           }
            
        }
    }
    
    public static void manipulateString() 
    {
        try 
        {
            String sentence;
            System.out.println("Enter a string: ");
            Scanner scanner = new Scanner(System.in);
            sentence = scanner.nextLine();
            char midString;
            int midPosition = sentence.length() / 2;
            midString = sentence.charAt(midPosition);
            String res = "Length of string: " + sentence.length() + "\n" + "Character at the middle index: " + midString;
            System.out.println(res);
        } catch (Exception e) 
        {
            System.out.println("Error!!! \n" + e.getMessage());
        }
    }
    
    public static void applyStringOptions() 
    {
        try
        {
            String sentence;
            String subString;
            System.out.println("Enter a string: ");
            Scanner scanner = new Scanner(System.in);
            sentence = scanner.nextLine();
            String indexS = sentence.substring(1, 5);
            String res = "Uppercase: " + sentence.toUpperCase() + "\n" + "Lowercase: " + sentence.toLowerCase();
            System.out.println(res);
            System.out.println("Substring (2nd to 5th index): " + indexS);
            System.out.println("Enter a substring to search: ");
            subString = scanner.nextLine();
            if (sentence.contains(subString)) 
            {
                System.out.println("The original string contains the substring: " + subString);
            } else {
                System.out.println("The substring, " + subString + "is not in the original string");
            }
        }catch(Exception e)
        {
            System.out.println("Error!!! \n" + e.getMessage());
        }
    }
    
    public static void convertStringToNumbers() 
    {
        try {
            String num;
            System.out.println("Enter a number as a string: ");
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextLine();
            int ans = parseInt(num) * 2;
            System.out.println("Result after conversion and multiplication: " + ans);
        } catch (NumberFormatException e) {
            System.out.println("Error!!! \n Please use a number");
        }
    }
    
}
