import java.util.Scanner;

public class nasedd {
    public static void main(String[] args) {

        int marksobtained, passingmarks;
        char grade;

        passingmarks = 40;

        Scanner sc = new Scanner(System.in);
        System.out.println("input markes scored by YOU");

        marksobtained = sc.nextInt();

        if (marksobtained >= passingmarks) ;
        {
          //  System.out.println("you passes the EXAM");
            // else{
            // System.out.println("you FAILED the EXAM");

            if (marksobtained > 90)
                grade = 'A';
          //  else {
              //  System.out.println("you FAILED the EXAM");
            }
        }
    }