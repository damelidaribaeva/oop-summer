import java.util.Scanner;
public class t6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        float sum = 0;

        while(n>0){
            sum += (float) 1/n;
            n--;
        }
        System.out.println(sum);
    }
}
