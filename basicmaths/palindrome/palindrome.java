import java.util.Scanner;
public class palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n  = sc.nextInt();

        int dup=n;
        int reverseno = 0;
        while(n>0){
            int lastdigit = n % 10;
           
            n  = n /10;
            reverseno = (reverseno*10)+lastdigit;
        }
       if(reverseno==dup){
        System.out.println("true");
       } else{
        System.out.println("false");
       }
    }
} 
