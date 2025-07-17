package Array;
import java.util.*;
public class binarysearch {
    public static int bs(int []arr,int n,int key){
        Arrays.sort(arr);//Used to sort array
        int s=0,e=n-1;
        int mid=s+(e-s)/2;
        while(s<=e){
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                e=mid-1;
            }
            else if(arr[mid]<key){
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }
        return -1;
    }
public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n;
    System.out.print("Enter the size of array: ");
    n=in.nextInt();
    int [] arr=new int[n];
    // Input
    System.out.print("Enter the elements of array: ");
    for(int i=0;i<n;i++){
        arr[i]=in.nextInt();
    }
    int key;
    System.out.print("Enter the value of key: ");
    key=in.nextInt();
    int y=bs(arr,n,key);
    if(y==-1)
    {
        System.out.print("The key "+key+" not exist in the array");
    }
    else System.out.print("The key is found at position: "+y);
}
}

//Some important points to remeber  we can use algorithums in java also same as c++ like(sort max,min,pow etc)
//but in java we have to use it with the help of Array.sort,Math.pow(),Math.max() etc.
//but most important point is we can't use swap algorithum directly how we use to use it in c++
//to sort anything in ascending order we use Array.sort() but for sorting in decsending order we use  Arrays.sort(arr, Collections.reverseOrder());