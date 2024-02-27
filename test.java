public class test {
    public static void main(String[] args) {

        test.sum(new int[]{10, 20, 30});

    }

    static void sum(int[] no) {

        int total = 0;
        for (int i : no) {

            total = total + i;

        }


        System.out.println(total);
    }

}