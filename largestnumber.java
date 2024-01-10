import java.util.*;

public class largestnumber {
    public static void main(String[] args) {
        int a , b, c;

        System.out.println("entered three integer");
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a>b && a>c)
            System.out.println("first number is largest .");
        else if(b>a && b>c)
            System.out.println("second number is largest .");
        else if(c>a && c>b)
            System.out.println("third number is largest .");
        else
            System.out.println("enterd number are not distinct .");
    }

}
