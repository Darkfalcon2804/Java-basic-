package Recursion;
import java.util.*;
import java.util.HashSet;
public class UniqueSubsequences {
static Scanner in=new Scanner(System.in);
    public static void unqi(String n,int index,String newString,HashSet<String>set){
        if(index==n.length()){
            if(set.contains(newString)){
            return;}
            else {
                System.out.println("The possible subsequence substrings is: "+newString);
                set.add(newString);
                return ;
            }
        }
   char CurrChar=n.charAt(index);
        unqi(n,index+1,newString+CurrChar,set);
        unqi(n,index+1,newString,set);
    }
    public static void main(String[] args){
    String n;
    System.out.print("Enter the String: ");
    n=in.nextLine();
HashSet<String>set=new HashSet<>();
    unqi(n,0,"",set);
}
}
