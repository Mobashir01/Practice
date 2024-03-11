import java.util.Scanner;

public class againtable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       // sc.nextInt();

        int t=
        sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(t + "*" + i + "=" + t * i);
        }
    }
}