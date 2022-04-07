package com.company;
import java.util.Scanner;
public class flowcontrolstatement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number==0){
            System.out.println("Zero");
        }
        else if(number%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

}
