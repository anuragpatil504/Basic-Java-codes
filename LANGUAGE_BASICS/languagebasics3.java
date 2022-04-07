package com.company;
import java.util.Scanner;

public class languagebasics3{
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        int num1,num2;
        num1 = myObj.nextInt();
        num2 = myObj.nextInt();
        int sum = num1 + num2;
        System.out.printf("The sum of %d and %d is %d",num1,num2,sum );

    }
}
