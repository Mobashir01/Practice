public class AgainthreeDarray {
    public static void main(String[] args) {

        int[][][]  a = {{{100,200,300},{4000,5000,6000},{70000,80000,90000,100000}}};

        for (int i = 0; i<a.length; i++){
            for(int j = 0; j<a[i].length; j++){
                for(int k = 0; k<a[i][j].length; k++){

                    System.out.print(a[i][j][k]);
                }
                System.out.println();
            }
        }
    }
}
