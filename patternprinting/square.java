package patternprinting;
import java.util.*;
public class square {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int m;
        System.out.print("Enter the rows: ");
        m=in.nextInt();
        int n;
        System.out.print("Enter the columns: ");
        n=in.nextInt();
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
