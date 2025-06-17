package Recursion;
import java.util.*;
import java.util.ArrayList;
public class SubsetofNaturalno {
 static Scanner in=new Scanner(System.in);
 public static void printSubset(ArrayList<Integer>subset){
     for(int i=0;i<subset.size();i++){
         System.out.print(subset.get(i)+" ");
     }
        System.out.println();
 }
 public static void findSubsets(int n,ArrayList<Integer>subset){
     if(n==0){
         printSubset(subset);
         return;
     }
     subset.add(n);
     findSubsets(n-1,subset);
     subset.remove(subset.size()-1);
     findSubsets(n-1,subset);
 }
 public static void main(String[] args){
     int n;
     System.out.print("Enter the Natural number: ");
     n=in.nextInt();
     ArrayList<Integer> subset=new ArrayList<>();
     findSubsets(n,subset);
 }
}
