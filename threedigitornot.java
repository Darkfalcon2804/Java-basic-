import java.util.*;
//Take positive integer input and tell if a three digit number or not ??
public class threedigitornot {
public static void main(String[] args){
       Scanner x=new Scanner(System.in);
       System.out.print("Enter the number: ");
       int y=x.nextInt();
       if(y>99&&y<1000){
           System.out.print("YES "+y+" is Three digit Number ");
       }
       else{
           System.out.print("No "+y+" is not the three digit number");
       }
}
}

