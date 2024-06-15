import java.util.Scanner;
public class t7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        double n = sc.nextDouble();
        double m = sc.nextDouble();

        while(n<=m){
            double y = -2.4*n*n+5*n-3;
            System.out.print(n);
            System.out.println(" " + y);
            n += 0.5;
        }

    }
}
