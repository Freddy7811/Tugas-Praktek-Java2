/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tugas_pbo2_fredi_irawan;

import java.util.Scanner;

/**
 *
 * @author A-22
 */
public class Praktekpbo {
     public static void main(String[] args) {
        // Step 3: Create 2 integer variables with names nilaiA and nilaiB
        // and initialize their values to 10 and 20 respectively
        int nilaiA = 10;
        int nilaiB = 20;

        // Step 4: Create 2 double variables with names and values of your choice
        double nilaiC = 1.5;
        double nilaiD = 2.5;

        // Step 5: Create a boolean variable with name isPlus
        // and initialize it to true
        boolean isPlus = true;

        // Step 6: Print the values of the variables
        System.out.println("nilaiA = " + nilaiA);
        System.out.println("nilaiB = " + nilaiB);
        System.out.println("nilaiC = " + nilaiC);
        System.out.println("nilaiD = " + nilaiD);
        System.out.println("isPlus = " + isPlus);

        // Step 8: Get new input values for the variables using Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a new value for nilaiA: ");
        nilaiA = input.nextInt();

        System.out.print("Enter a new value for nilaiB: ");
        nilaiB = input.nextInt();

        System.out.print("Enter a new value for nilaiC: ");
        nilaiC = input.nextDouble();

        System.out.print("Enter a new value for nilaiD: ");
        nilaiD = input.nextDouble();

        System.out.print("Enter a new value for isPlus (true/false): ");
        isPlus = input.nextBoolean();

        // Step 9: Print the updated values of the variables
        System.out.println("nilaiA = " + nilaiA);
        System.out.println("nilaiB = " + nilaiB);
        System.out.println("variable1 = " + nilaiC);
        System.out.println("variable2 = " + nilaiD);
        System.out.println("isPlus = " + isPlus);

        // Step 10: Get a new input value for a String variable
        System.out.print("Enter a new value for a String variable: ");
        String myString = input.nextLine();
        myString = input.nextLine();

        // Print the updated value of the String variable
        System.out.println("myString = " + myString);
    }
}


