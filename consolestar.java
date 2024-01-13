public class consolestar {
    public static void main(String[] args) {
        int row,numberofstar;
        for(row = 1; row<=10; row++){
            for(numberofstar = 1; numberofstar<=row; numberofstar++){

                System.out.println("*");
            }
            System.out.println();    //next line ;
        }
    }
}
