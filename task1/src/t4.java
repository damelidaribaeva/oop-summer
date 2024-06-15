import java.util.Scanner;
public class t4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers:");

        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double value = 5 * x * x - 7 * x + 2;

        if (y == value) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
