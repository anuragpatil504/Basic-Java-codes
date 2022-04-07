package com.company;

import java.util.Scanner;

public class flowcontrolstatement8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char var  = sc.next().charAt(0);
        switch (var){
            case 'R':
                System.out.println("Red");
                break;
            case 'B':
                System.out.println("Blue");
                break;
            case 'G':
                System.out.println("Green");
                break;
            case 'W':
                System.out.println("White");
                break;
            case 'O':
                System.out.println("Orange");
                break;
            case 'Y':
                System.out.println("Yellow");
                break;
            default:
                System.out.println("Invalid Code");
        }

    }
}
