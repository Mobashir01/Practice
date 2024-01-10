import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("entered the number .");
 num = sc.nextInt();
        if(num % 2 == 0)
        System.out.println("even");
        else{
            System.out.println("odd");

        }
    }
}
