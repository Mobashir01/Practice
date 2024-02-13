import java.util.Scanner;

public class bit {
    public static void main(String[] args) {

        int n = 5;
        int pos = 2;
        int bitMask = 1<< pos;

        if((bitMask & n)==0){
            System.out.println("bit was zera");

        }
        else{
            System.out.println("bit was one");
        }
    }
}
