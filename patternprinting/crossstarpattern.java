package patternprinting;
import java.util.*;
public class crossstarpattern {
public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n;
    System.out.print("Enter the number: ");
    n=in.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(i==j||(i+j)==n+1){
                System.out.print("*");
            }
            else System.out.print(" ");
        }
        System.out.print("\n");
    }
}
}
