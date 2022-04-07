package com.company;

import java.util.Scanner;

public class flowcontrolstatement16 {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        int  number = sc.nextInt();
        while(number>0){
            int a = number%10;
            System.out.print(a);
            number = number/10;
        }
    }
}
