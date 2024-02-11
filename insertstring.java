import java.util.Scanner;

public class insertstring {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("mobashir");
        System.out.println(sb);

        // for insert the string at index 5;
        sb.insert(5, 's');
        System.out.println(sb);
    }
}
