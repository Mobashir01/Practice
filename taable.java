import java.util.Scanner;

public class taable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number ");
        int a=
        sc.nextInt();
        System.out.println("enter the length of the table ");

        int length;
        sc.nextInt();

        for(int i = 1; i<=10; i++){
            System.out.println(a*i);
        }

    }
}
