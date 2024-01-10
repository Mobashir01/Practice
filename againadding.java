import java.util.Scanner;

public class againadding {
    public static void main(String[] args) {

        //taking input
        int a,b,moby;

        System.out.println("entered two integer to calculate their sum " );
           Scanner sc = new Scanner(System.in);

           a = sc.nextInt();
           b = sc.nextInt();
           moby = a + b ;

        System.out.println("sum of entered integers ="+moby);
    }
}
