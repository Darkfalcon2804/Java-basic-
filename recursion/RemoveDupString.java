package Recursion;
import java.util.*;
public class RemoveDupString {
    public static boolean[] arr=new boolean[256];
    static Scanner in=new Scanner(System.in);
    public static void dupl(String n,int index,String newString){
    if(index==n.length()){
        System.out.print("The string after the removal duplicates element is: "+newString);
        return ;
    }
    char  currChar=n.charAt(index);
    if(arr[currChar]){  //TRUE
        dupl(n,index+1,newString);
    }
    else{
        newString+=currChar;
        arr[currChar]=true;
        dupl(n,index+1,newString);
    }
}
public static void main(String[] args){
    String n;
    System.out.print("Enter the string: ");
    n=in.nextLine();

    dupl(n,0,"");
}
}
