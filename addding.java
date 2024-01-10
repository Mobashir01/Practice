import java.util.Scanner;

public class addding {
    public static void main(String[] args) {

        //taking input
        int x,y,z;

        System.out.println("enter the number to calculate their sum");
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();
        z = x + y;

        System.out.println("sum of eneterd ineger ="+z);

    }
}
