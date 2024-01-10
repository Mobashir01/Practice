import java.util.Scanner;


public class markscore {
    public static void main(String[] args) {
         int marksobtained, passingmark;

         passingmark = 40;
         Scanner sc = new Scanner(System.in);

        System.out.println("input marks scored by you");
        marksobtained = sc .nextInt();

        if(marksobtained >= passingmark){
            System.out.println("you passed the EXAM .");




        }
        else{
            System.out.println("you are FAIL");
        }
    }


}
