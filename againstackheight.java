public class againstackheight {
    public static int calcpower(int x, int n){
        if ( n== 0){
            return 1;
        }
        if(n % 2 == 0){
            return calcpower(x ,n/2) * calcpower(x,n/2)* x;

        }
        else {
            return calcpower(n,n/2) * calcpower(x, n/2 ) * x;
        }
    }

    public static void main(String[] args) {
        int x=2, n=5;
        int ans = calcpower(x ,n);
        System.out.println(ans);


    }
}
