/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author rajit
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int age;
        String name;
        String school;
        String hobby;
        System.out.print("Enter your Name: ");
        name=input.next();
//read first integer from user
        System.out.print("\n Enter the age: ");
        age = input.nextInt();
        
        System.out.println("\nEnter the School ");
        school=input.next();
        
        System.out.println("\nEnter the hobby ");
        hobby=input.next();
        
        System.out.println("\n\nYou Entered name is "+name);
        System.out.println("You Entered School is "+school);
        System.out.println("You Entered age is "+age);
        System.out.println("Your hobby is "+hobby);
        
       
    }

}
