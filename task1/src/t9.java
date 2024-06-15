import java.util.Scanner;

public class t9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int result = 0;

        for(int i = 0; i < input.length(); i++) {
            int cur = Integer.parseInt(input.substring(i, i+1));
            result += cur;
        }
        System.out.println(result);
    }
}