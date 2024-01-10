import java.util.Scanner;

public class comparestring {

    public static void main(String[] args) {
        String s1, s2;

        Scanner sc = new Scanner(System.in);
        System.out.println("entered the first string .");

        s1 = sc.nextLine();

        System.out.println("entered the second string .");
        s2 = sc.nextLine();

        if(s1. compareTo(s2) > 0)
            System.out.println("first string is greater than second .");
        else if(s1. compareTo(s2) < 0) {


            System.out.println("second string is smaller . ");
        }
        else {
            System.out.println("both string are equal .");
        }


    }
}
