import java.util.*;
public class Swapwithvariable {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int x;
        System.out.print("Enter X value: ");
        x=in.nextInt();
        int y;
        System.out.print("Enter Y value: ");
        y=in.nextInt();
        System.out.print("After swapping the values: "+"\n");
        int temp;
        temp=x;
        x=y;
        y=temp;
        System.out.print("X="+x+"\n"+"Y="+y);
    }
}
