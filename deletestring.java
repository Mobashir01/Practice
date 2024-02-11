import java.util.*;

public class deletestring {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("mobasshir");

        System.out.println(sb);

        // insert the extra string;
        sb.insert(5, 's');

        // delete the extra string;
        sb.delete(4,5);
        System.out.println(sb);

    }
}
