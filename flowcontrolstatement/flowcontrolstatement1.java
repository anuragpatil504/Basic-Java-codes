package com.company;
import java.util.Scanner;

public class flowcontrolstatement1 {
    public static void main(String[] args) {
       //a
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number==0){
            System.out.println("Number is zero");

        }
        else if(number<0){
            System.out.println("Number is negative");
        }
        else{
            System.out.println("Number is positive");
        }

        //b
        Scanner obj = new Scanner(System.in);
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        int a = num1%10;
        int b = num2%10;
//        System.out.println(a);
//        System.out.println(b);
        if(a==b){
            System.out.println("True");
        }
    }
}
