public class fib2 {
    public static void printfib(int a, int b, int n){
        if (n == 0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        printfib(b, c, n-1);
    }

    public static void main(String[] args) {
        int a = 0,b=4;
        System.out.println(a);
        System.out.println(b);

        int n = 9;
        printfib(a,b, n-2);
    }
}