package patternprinting;
import java.util.*;
public class reverserighttriangle {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n;
        System.out.print("Enter the number: ");
        n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=n+1-i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
