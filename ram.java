import java.util.*;
public class ram {

    public static void main(String[] args) {
        int n=5;
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=i; j++){
                int sum = i+j;

                if(sum% 2 == 0) {
                    //even
                    System.out.println("1");

                } else {
                    //odd
                    System.out.println("0");

                }

            }
            System.out.println();

        }
    }
}
