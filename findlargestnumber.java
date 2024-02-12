import java.util.*;

public class findlargestnumber {
    public static void main(String[] args) {

        int [] number = new int[5];

        Scanner sc = new Scanner(System.in);


        System.out.println("enter the element of array");

            for(int i=0;i<5;i++)
            {
                number[i]=sc.nextInt();

            }
            int max=number[0];
            for(int i=0;i<5;i++)
            {
                if(number[i]>max)
                {
                    max=number[i];
                }
            }
        System.out.println("largest is"+max);








    }
}
