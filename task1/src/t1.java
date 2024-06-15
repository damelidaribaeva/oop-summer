import java.util.Scanner;
public class t1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        double number = sc.nextDouble();
        double number2 = sc.nextDouble();

        if(number > number2){
            System.out.println(number + " is greater than" + number2);
        }
        else if(number < number2){
            System.out.println(number + " is less than " + number2);
        }
        else{
            System.out.println(number + " is equal to " + number2);
        }
        sc.close();
    }
}
