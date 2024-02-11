import java.util.Scanner;

public class newwstrings {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("moby");
        System.out.println(sb);

        //for insertion a char at string
       sb.insert(0, 'k');
        System.out.println(sb);
    }
}
