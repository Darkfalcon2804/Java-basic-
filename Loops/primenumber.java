package loops;
import java.util.*;
public class primenumber {
    public static void main(String[] args){
        Scanner u=new Scanner(System.in);
        int n;
        System.out.print("Enter the number: ");
        n=u.nextInt();
        int check=1;
        for(int i=2;i<=n-1;i++){
            if(n%i==0) {
                check = 0;
                break;
            }
        }
        if(check==0) System.out.print(n+" is composite number");
         else if(n==1) System.out.print("Neither prime nor composite");
         else if(check==1) System.out.print(n+" is prime number");
    }
}
