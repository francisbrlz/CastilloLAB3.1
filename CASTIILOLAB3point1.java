/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.castiilolab3point1;

import java.util.Scanner;

/**
 *
 * @author Francis
 */
public class CASTIILOLAB3point1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome! Please input a number:");
        System.out.println("""
                           Input 0 for Fiding Sum and Average of an Array 
                            Input 1 for Finding Maximum and Minimum Element  
                            Input 2 for Reverse an Array 
                            Input 3 for Frequency Counter """);
       

        int choice = input.nextInt();

        switch (choice) {
            case 0:
                SumAverage(input);
                break;
            case 1:
                MaxMin(input);
                break;
            case 2:
                RevArray(input);
                break;
            case 3:
                FreqCounter(input);
                break;
            default:
                System.out.println("Invalid option");
        }

        input.close();
    }

    public static void SumAverage(Scanner input) {
        int[] array = new int[10];
        int sum = 0;

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
            sum += array[i];
        }

        double average = sum / 10.0;

        System.out.println("Sum of array: " + sum);
        System.out.println("Average of array: " + average);

        
    }

    public static void MaxMin(Scanner input) {
        int[] array = new int[15];

        System.out.println("Enter 15 integers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];

            }
        }

        System.out.println("Maximum element is: " + max);
        System.out.println("Minimum element is: " + min);
        
    }

    public static void RevArray(Scanner input) {
        double[] array = new double[5];

        System.out.println("Enter 5 floating-point numbers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }

        System.out.println("Array in reverse order:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        
    }

    public static void FreqCounter(Scanner input) {
        int[] array = new int[10];

        System.out.println("Enter 10 integers between 1 and 100 only:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("Enter number to check its frequency:");
        int numberToCheck = input.nextInt();

        int count = 0;
        for (int num : array) {
            if (num == numberToCheck) {
                count++;

            }
        }

        System.out.println("The number " + numberToCheck + " appear only " + count + " times in the array you provided.");
        
    }
    }


    
