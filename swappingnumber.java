import java.util.Scanner;

public class swappingnumber {
    public static void main(String[] args) {
         int a,b,temp;

        System.out.println("entered a and b ");
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("before swapping \na ="+a+"\nb = "+b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("after swapping\na = "+a+"\nb = "+b);
    }
}
