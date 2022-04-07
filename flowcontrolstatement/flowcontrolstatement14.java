package com.company;

import java.util.Scanner;

public class flowcontrolstatement14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int a =0;
        while(number>0){
            int rem = number%10;
            a = a+ rem;
            number = number/10;

        }
        System.out.println(a);
    }
}
