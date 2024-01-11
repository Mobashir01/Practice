import javax.swing.*;
import java.util.*;

public class begin {
    public static void main(String[] args) {

        int moby;

        System.out.println("entered the number  .");
        System.out.println("to check eligible for vote or not .");
        Scanner sc = new Scanner(System.in);

     moby = sc.nextByte();

        if (moby >= 18)
            System.out.println("YES moby is  adult and he  is eligible for vote .");


          else {


                System.out.println(" moby is  not eligible for vote .");

            System.out.println("You are not allowed by GOVERNMENT until you adult .");
            System.out.println("THANK YOU .!!");

            }
        }
    }
