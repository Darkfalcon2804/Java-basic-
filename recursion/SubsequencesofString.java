package Recursion;
import java.util.*;
public class SubsequencesofString {
static Scanner in=new Scanner(System.in);
public static void Subsequences(String n,int index,String newString){
 if(index==n.length()){
     if(!newString.equals("")){
     System.out.println("The possible subsequence substrings is: "+newString);}
     return;
 }
    char currChar=n.charAt(index);
 Subsequences(n,index+1,newString+currChar);
 Subsequences(n,index+1,newString);
}
public static void main(String[] args){
    String n;
    System.out.print("Enter the string: ");
    n=in.nextLine();
    Subsequences(n,0,"");
}
}
