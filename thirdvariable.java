import java.util.Scanner;

public class thirdvariable {
    public static void main(String[] args) {

        //swap two number without using 3rd variable
        int a,b;

        System.out.println("enter a and b");
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("before swapping \na = "+a+"\nb = "+b );

        a = a + b;
        b = a - b;
        a = a - b;


    }
}
