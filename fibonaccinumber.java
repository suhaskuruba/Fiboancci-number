import java.util.*;

public class fibonaccinumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // inputting the fibonacci number

        int a = 0;
        int b = 1;

        int i = 1;
        while (i <= n) {
            int temp = b;
            b = a + b;
            a = temp;
            i++;
        }
        System.out.println(b);
    }
}
