package com.company;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.Math;
public class Main {
    public static long Factorial(int number) {
        if(number==0) return 1;
        return number*Factorial(number-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число : ");
        int number=input.nextInt();
        System.out.print("Факториал числа "+number+": " + " = "+ Factorial(number));
    }
}

