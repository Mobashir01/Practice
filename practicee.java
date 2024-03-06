import java.util.Scanner;

public class practicee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.nextInt();

        System.out.println("i am so proud of you ");

        int[] marks = new int[3];

           marks[0] = 98;
        System.out.println("pass and you got a 98 number in maths ");

           marks[1] = 99;
        System.out.println("pass and your secured a 99 number in physics ");

           marks[2] = 97;
        System.out.println("pass and you secured a 97 number in chemisrty ");

           sc.nextInt();



            for (int i = 0; i < 3; i++){
                System.out.println(marks [i]);
            }
        }
    }

