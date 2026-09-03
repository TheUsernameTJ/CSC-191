/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectanglecalculator;

/**
 *
 * @author torivio_hall144
 */

import java.util.Scanner;

public class RectangleCalculator {

// course: CSC 190
// project: Lab 1
// date: 1.23.2026
// author: TJ Hall
// purpose: Calculates the area and perimeter of a rectangle after receiving length and width input from the user.
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("CSC 190 Lab 1 - Problem 1: Rectangle Calculator.");
        
        //Prompt the reader to enter length and width.
        System.out.println("Enter the rectangle length and then width (as a decimal):");
        double recLength, recWidth, recArea, recPerimeter;
        
        //Call for length input from reader.
        System.out.print("Rectangle Length: ");
        recLength = input.nextDouble();
        
        //Call for width input from reader.
        System.out.print("Rectangle Width: ");
        recWidth = input.nextDouble();
        
        //Calculate area & perimeter from the length & width inputs.
        recArea = recLength*recWidth;
        recPerimeter = 2*(recLength+recWidth);
        
        //Prints out the results of the rectangle.
        System.out.println("\nRectangle Calculations:");
        System.out.println("Length: " + recLength);
        System.out.println("Width: " + recWidth);
        System.out.println("Area: " + recArea);
        System.out.println("Perimeter: " + recPerimeter);
        
        
    }
    
}
