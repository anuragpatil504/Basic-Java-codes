package com.company;

import java.util.Scanner;

public class flowcontrolstatement13 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int number = sc.nextInt();
        int flag = 0;

        for (int i = 23; i < 99; i++) {
            if (isprime(i)==true) {
                System.out.println(i);
            }
        }
    }
        public static boolean isprime(int n) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }


            }
            return true;
        }





}
