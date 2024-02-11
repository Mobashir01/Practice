import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class stringsbuilderr {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("computer");
        System.out.println(sb);

        //indexing of string
        System.out.println(sb.charAt(3));

        // set char at string
       // System.out.println(sb.setCharAt(3, 'm'());
        sb.charAt(3);
        System.out.println(sb);

        // char insert in string
        System.out.println(sb.insert(3, 'p'));

        //char delete in string
        sb.delete(2,3);
        System.out.println(sb);

        //new string add
        sb.append("science");
        System.out.println(sb);

        //char length of string
        System.out.println(sb.length());
    }
}


