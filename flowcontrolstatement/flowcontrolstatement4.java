package com.company;
import java.util.Scanner;

public class flowcontrolstatement4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        if(a>b){
            System.out.print(b);
            System.out.print(",");
            System.out.print(a);
        }
        else{
            System.out.print(a);
            System.out.print(",");
            System.out.print(b);
        }
    }
}
