package Functions;
import java.util.*;
public class pascaltriangle {
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }
    public static int ncr(int n,int r){
        return fact(n)/(fact(r)*fact(n-r));
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n;
        System.out.print("Enter the number: ");
        n=in.nextInt();
      for(int i=0;i<=n;i++){
          for(int j=0;j<=n-i+1;j++){
                System.out.print(" ");
          }
          for(int k=0;k<=i;k++){
              System.out.print(" "+ncr(i,k));
          }
          System.out.print("\n");
      }
    }
}
