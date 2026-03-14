public class Pattern {
    public static void main(String[] args) {

        int n = 9;

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n; j++) {

                if((i == 1 && j == 5) || 
                   (i == 2 && (j == 4 || j == 6)) ||
                   (i >= 3 && i <= 7 && (j == 3 || j == 7)) ||
                   (i == 8 && (j == 4 || j == 6)) ||
                   (i == 9 && j == 5))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }
    }
}