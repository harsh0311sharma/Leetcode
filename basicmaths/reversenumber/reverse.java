
import java.util.Scanner;
public class reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n  = sc.nextInt();
        int count = 0;
        int reverseno = 0;
        while(n>0){
            int lastdigit = n % 10;
            count = count + 1;
            n  = n /10;
            reverseno = (reverseno*10)+lastdigit;
        }
        System.out.println("Reverse Number:" + reverseno);
    }
}