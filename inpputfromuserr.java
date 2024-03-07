import java.sql.SQLOutput;
import java.util.Scanner;

public class inpputfromuserr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // for string
        System.out.println("enter your name please :");
        String name = sc.next();

        // for gender
        System.out.println("enter your gender :");
        char gender = sc.next().charAt(0);

        // for age
        System.out.println("enter your age :");
        int age = sc.nextInt();

        // for phone number
        System.out.println("enter your phone number :");
        long phno = sc.nextLong();
        System.out.println("THANK YOU MA'AM");

        System.out.println("-------------------------------------------------");
        System.out.println("name :"+name);
        System.out.println("gender :"+gender);
        System.out.println("age :"+age);
        System.out.println("phone number :"+phno);
        System.out.println("THANK YOU MA'AM");
        System.out.println("I LOVE YOU :");
    }
}