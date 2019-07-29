package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Δώστε τον 1ο αριθμό :");
        int number1 = input.nextInt();
        System.out.print("Δώστε τον 2ο αριθμό :");
        int number2 = input.nextInt();
        int sum = number1 + number2;
        System.out.println("Το άθροισμα είναι : " + sum);
    }
}
