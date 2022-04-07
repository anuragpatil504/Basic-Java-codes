package com.company;

import java.util.Scanner;

public class flowcontrolstatement12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int flag=0;

        for(int i = 2;i<number;i++){

            if(number%i==0){
                flag=0;
                //System.out.println("Not a prime number");
                break;
            }
            else{
                flag=1;
                //System.out.println("Prime number");

            }

        }
        if(flag==1){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Non Prime number");
        }
    }
}
