public class basicsofsorting {
    public static void main(String[] args) {

        int[] a = {7,4,2,4,5,8,9,10,12,22};
        int temp;

        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length-1; j++){

                if(a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                }
            }
        }
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]+ " ");
        }

    }
}
