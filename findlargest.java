import javax.swing.*;

import java.util.Scanner;

public class findlargest {

    public static void main(String[] args) {

        //taking input
        int a, b, c;

        System.out.println("entered three integers");
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > b && a > c) {

            System.out.println("first number is largest");

        } else if (b > a && b > c) {
            System.out.println("second number is largest");

        } else if (c > a && c > b) {
            System.out.println("third number is largest");
        } else {
            System.out.println("entered number are not distinct");
        }
    }
}