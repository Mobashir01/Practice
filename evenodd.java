import java.util.*;

public class evenodd {
    public static void main(String[] args) {
           int x;


        System.out.println("entered the number of odd or even");
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();

        if(x % 2 == 0)
            System.out.println("you entered an even number .");
        else
            System.out.println("you entered an odd number .");
    }
}
