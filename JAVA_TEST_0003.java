public class JAVA_TEST_0003 {
    public static void main(String[] args) {

        int n = 6;

        for(int i = 1; i <= n; i++) {

            int num;
            if(i % 2 == 1)
                num = 1;
            else
                num = 0;

            for(int j = 1; j <= i; j++) {
                System.out.print(num);
                num = (num == 1) ? 0 : 1;
            }

            System.out.println();
        }
    }
}