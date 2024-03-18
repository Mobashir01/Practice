public class comparetoo {
    public static void main(String[] args) {

        int[] a = {1,12,123,1234,12345,123456,1234567,12345678,123456789,1000000000};
        int temp , j;

        for(int i = 1; i<a.length; i++) {
            temp = a[i];
            j = i;
            while (j > 0 && a[j - 1] > temp) {
                a[j] = a[j - 1];
                j = j - 1;
            }
            a[j] = temp;

        }
        for (int i =0; i<a.length; i++){
            System.out.println(a[i]+" ");
        }
    }
}
