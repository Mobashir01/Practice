import java.util.Scanner;

public class bitupdated {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int oper = sc.nextInt();

        //operation = 1 set operation = 0 clear
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;

        if(oper == 1){
            //set
            int newNumber = bitMask| n;
            System.out.println(newNumber);

        }
        else{
            //clear
            int newbitmask = ~ (bitMask);
            int newNumber = newbitmask & n;
            System.out.println(newNumber);
        }
    }
}
