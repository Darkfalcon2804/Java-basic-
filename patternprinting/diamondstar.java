package patternprinting;
import java.util.*;
public class diamondstar {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n;
        System.out.print("Enter the number: ");
        n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");}
            System.out.print("\n");
        }

        for(int a=n-1;a>=1;a--){
            for(int b=1;b<=n-a;b++){
                System.out.print(" ");
            }
            for(int c=1;c<=2*a-1;c++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
