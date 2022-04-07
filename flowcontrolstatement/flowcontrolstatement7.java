package com.company;

import java.util.Locale;
import java.util.Scanner;

public class flowcontrolstatement7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = a.toUpperCase();
        String c = a.toLowerCase();
        {
            if(a==b){
                System.out.println(c);
            }
            else if(a==c){
                System.out.println(b);
            }
        }

    }
}
