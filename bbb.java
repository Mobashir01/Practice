public class bbb {
    public static void main(String[] args) {

        int[] a={9,98,987,9876,98765,987654,9876543,98765432,87654321,100000};
        int temp;

        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length-1; j++){

                if(a[j] > a[j+1]){

                   temp = a[j];
                  a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
           // for(int i = 0; i<a.length; i++){
              //  System.out.println(a[i]+" ");

            }
           for (int i = 0; i<a.length; i++){
               System.out.println(a[i]+" ");
        }


    }
}
