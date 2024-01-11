import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int n,c,fact =1;

        System.out.println("entered the integer to calculate the factorial .");
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        if ( n < 0)
            System.out.println("number should be non-negative .");
        else{
            for(c = 1 ; c<=n ; c++)
                fact = fact *c;

            System.out.println("factorial of "+n+" is = " + fact);
            
        }
    }
}
