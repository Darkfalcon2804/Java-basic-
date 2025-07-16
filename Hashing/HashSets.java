package Hashing;
import java.util.HashSet;
import java.util.Iterator;
public class HashSets{
public static void main(String[] args){
    //Creating
    HashSet<Integer>set=new HashSet<>();
    //Insert
    set.add(1);
    set.add(2);
    set.add(3);
//    set.add(1);
    //we have use set.add(1) two but it will store 1 only one time because set only allows unique elements

    //Size
    System.out.println("Size of set is: "+set.size());

    //Search-special function call contains
    if(set.contains(1)){
        System.out.println("set contains 1");
    }
    if(!set.contains(6)){
        System.out.println("does not contain");
    }
    //Delete
    set.remove(1);
    if(!set.contains(1)){
        System.out.println("does not contain 1-we deleted 1");
    }
    set.add(1);
    //Print all elements
    System.out.println(set);

    //Iterator- special thing in set used for travesing in iterator
    Iterator i=set.iterator();
    //two important functions of iterators are =>hasNext; =>next;
    // iterator in starting do point to first element it first point to null element on doing i.next it will point first element and i is basically iterator variable
    // This is all about next function lets talk about hasNext function of iterator
    //hasNext just returns true false if contain then returns true else if dont contain then returns false
    while(i.hasNext()){
        System.out.println(i.next());
    }
}
}
