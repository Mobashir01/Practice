import java.util.Scanner;
public class numberswaping {

    public static void main(String[] args) {
        int x,y,temp;

        System.out.println("enterd x and y");
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("before swapping \nx = "+x+"\ny ="+y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("after swapping \nx ="+x+"\ny = "+y);
    }
}
