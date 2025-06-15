package Recursion;
import java.util.*;

public class keypadCommbination {
    static Scanner in=new Scanner (System.in);
     public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
     public static void printComb(String n,int index,String combination){
         if(index==n.length()){
             System.out.println("The possible combination is: "+combination);
             return;
         }
         char CurrChar=n.charAt(index);
         String mapping=keypad[CurrChar-'0'];
         for(int i=0;i<mapping.length();i++){
             printComb(n,index+1,combination+mapping.charAt(i));
         }
     }
    public static void main(String[] args){
     String n;
     System.out.print("Enter the string: ");
     n=in.nextLine();
     printComb(n,0,"");
}
}
