import java.util.Scanner;

public class t8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            double term = 1.0 / (2 * i + 1);
            if (i % 2 != 0) {
                term = -term;
            }
            sum += term;
        }

        System.out.println(sum);
    }
}
