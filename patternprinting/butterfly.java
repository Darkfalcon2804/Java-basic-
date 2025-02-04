package patternprinting;
import java.util.*;
public class butterfly {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n;
        System.out.print("Enter the number: ");
        n=in.nextInt();
        //lower half
        for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        for(int k=1;k<=2*(n-i);k++){
            System.out.print(" ");
        }
        for(int s=1;s<=i;s++){
            System.out.print("*");
        }
        System.out.print("\n");
        }

        //upper half
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int s=1;s<=i;s++){
                System.out.print("*");
            }
            System.out.print("\n");
        }






    }
}
