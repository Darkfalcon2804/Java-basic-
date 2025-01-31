import java.util.*;

public class ternaryoperator {
    public static void main(String[] args){
   Scanner c=new Scanner(System.in);
   int y;
   System.out.print("Enter the value: ");
   y=c.nextInt();
        String result=(y%2==0)?y+" is Even number":y+" is Odd number";
        System.out.print(result);
    }
}
