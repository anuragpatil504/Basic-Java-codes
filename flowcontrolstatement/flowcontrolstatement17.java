package com.company;

import java.util.Scanner;

public class flowcontrolstatement17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String str="";
        int check  = number;
        while (number > 0) {
            int a = number % 10;
           // System.out.print(a);
            str = str + a;
            number = number / 10;
        }
        int newint = Integer.parseInt(str);
        //System.out.println(newint);
        if(newint==check){
            System.out.println(" is a palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}