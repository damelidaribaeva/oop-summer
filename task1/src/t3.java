import java.util.Scanner;
public class t3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("total distance, hours before, hours after");
        int total = sc.nextInt();
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();

        int s1 = 20;
        int s2 = total - s1;

        int v1 = s1/t1;
        int v2 = s2/t2;

        if(v1>v2){
            System.out.println("before");
        }
        else{
            System.out.println("after");
        }
    sc.close();
    }
}
