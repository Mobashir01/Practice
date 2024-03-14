import java.util.Scanner;

public class tests {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name ");
        //sc.nextInt();
        String name =sc.next();
      // sc.nextInt();

        //for gender

        System.out.println("enter the gender ");
        char gender = sc.next().charAt(0);

        // for age
        System.out.println("Enetr the age ");
        int age = sc.nextInt();

        // for phone number
        System.out.println("enter the phone number ");
        long phone = sc.nextLong();

        System.out.println(name);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(phone );
    }
}
