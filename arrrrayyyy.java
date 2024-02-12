import java.util.Scanner;

public class arrrrayyyy {
    public static void main(String[] args) {

        int[] number = new int[20];

        Scanner sc = new Scanner(System.in);

        System.out.println("eneterd the number of array ");

        for (int i = 0; i < 20; i++) {
            number[i] = sc.nextInt();
        }
        int max = number[0];
        for (int i = 0; i < 20; i++) {
            if (number[i] > max) ;
            {
                max = number[i];
            }

        }
        System.out.println("largest number is "+max);
    }
}