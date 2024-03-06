public class greateroffour {
    public static void main(String[] args) {

        int a = 1000, b = 200, c = 300, d = 400;

        if (a>b && a>c && a>d){
            System.out.println("a is the greater element among these ");

        }
        else if (b>a && b>c && b>d){
            System.out.println("b is greater then a and b , c ");


        }
        else if (c>a && c>b && c>d){
            System.out.println("c is the greater element among these ");

        }
        else{
            System.out.println("d is the greater element of all are the element");
        }
    }
}
