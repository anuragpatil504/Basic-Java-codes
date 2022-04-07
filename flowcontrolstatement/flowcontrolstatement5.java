package com.company;

import java.util.Scanner;
import java.util.regex.*;

public class flowcontrolstatement5 {
    public static void main(String[] args) {
//
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int value = scanner.nextInt();
            System.out.print("Digit");
            return;
        }

        String value = scanner.next();

        if (value.isEmpty()) {
            return;
        }
        char c = value.charAt(0);

        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.print("Alphabet");
        } else {
            System.out.print("Special character");
        }
    }
}
