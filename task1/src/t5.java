import java.util.Scanner;
public class t5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number;
        int sumOfOddNumbers = 0;

        System.out.println("Enter numbers:");

        while(true){
            number = sc.nextInt();
            if(number == 0){
                break;
            }
        if(number % 2 != 0){
            sumOfOddNumbers += number;
        }
        }
        System.out.println(sumOfOddNumbers);
        sc.close();
    }
}
