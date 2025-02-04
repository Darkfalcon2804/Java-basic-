import java.util.*;
public class Swapwithoutvariable {
public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int x;
    System.out.print("Value of X=");
    x=in.nextInt();
    int y;
    System.out.print("Value of Y=");
    y=in.nextInt();
    System.out.print("After swapping the values of \n");
    x=x+y;
    y=x-y;
    x=x-y;
    System.out.print("X="+x+"\n"+"Y="+y);
}
}
