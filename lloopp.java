import java.util.Scanner;

public class lloopp {

    public static void main(String[] args) {

        System.out.println("entered the number .");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for( int i = 1; i<=10; i++){
            System.out.println(i*n);
        }

    }
}
