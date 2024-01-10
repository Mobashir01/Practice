//,mimport javax.swing.*;
import java.util.Scanner;

public class checknumber {
    public static void main(String[] args) {

        int x;
        System.out.println("enter the number to check odd or even");
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();

        if (x % 2 == 0)
        System.out.println("you entered an even number .");
          else
            System.out.println("you entered an odd number .");
        }
    }
