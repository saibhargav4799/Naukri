package org.example;

import java.util.Scanner;

public class Assigments {


    public static void main(String[] args) {

//        Assigment1

        int[] array = {1,2,3,4,5};

        int length;
        length= array.length;

        System.out.println(length);

        //SECOND

        System.out.println("first element"+ array[0]);

        System.out.println("first element"+ array[length-1]);

        // printing array in reverse

//        for (int i = array.length - 1; i >= 0; i--) {
//            System.out.println(array[i]);
//        }
//        int sum=0;
//        for (int y =0; y< array.length;y++){
//            {
//                sum += array[y];
//            }
//        }System.out.println(sum);
        int num = 1234321;
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println(reversed);
        if (original == reversed) {
            System.out.println("same");
        }

            Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");     // Prompt message
            int Number = scanner.nextInt();              // Read integer input

        System.out.println("You entered: "+Number);
        }




}
