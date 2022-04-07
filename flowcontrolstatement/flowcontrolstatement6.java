package com.company;

import java.util.Scanner;

public class flowcontrolstatement6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char gender = sc.next().charAt(0);
        //System.out.println(gender);
        int age = sc.nextInt();
        if(gender=='f' && (1<=age && age<=58)){
            System.out.println("The percentage of interest is 8.2%");
        }
        else if(gender=='f'&& (59<=age && age<=100)){
            System.out.println("The percentage of interest is 9.2%");
        }
        else if(gender=='m' && (1<=age && age<=58)){
            System.out.println("The percentage of interest is 8.4%");
        }
        else if(gender=='m' && (59<=age && age<=100)){
            System.out.println("The percentage of interest is 10.5%");
        }
        else{
            System.out.println("Good");
        }
    }
}
