import java.util.Scanner;
public class armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n  = sc.nextInt();
        int sum = 0;
        int dup=n;
        
        while(n>0){
            int lastdigit = n % 10;
           
            n  = n /10;
            sum = sum + (lastdigit*lastdigit*lastdigit);          
            
        }
       if(sum==dup){
        System.out.println("true");
       } else{
        System.out.println("false");
       }
    }
} 
