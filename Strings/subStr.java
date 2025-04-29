//QGiven a string s print all the substrings of s??

package Strings;
import java.util.*;
public class subStr {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
//        String str="abcde";
//        System.out.println(str.substring(0,3));
//   //substring(i,j) is inbuilt function which means i th index to (j-1)index
//        System.out.print(str.substring(3));
//        //substring(i) is inbuilt function which means print i th index till end
    String s;
    System.out.print("Enter you data: ");
    s=in.next();
    System.out.println("The length of string: "+s.length());
    int n=s.length()-1;
    for(int i=0;i<=n;i++){
      for(int j=i+1;j<=n+1;j++){
           System.out.print(s.substring(i,j)+" ");
       }}
    }
    }

