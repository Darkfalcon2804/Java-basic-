package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class BasicsArrayList {
    public static void main(String[] args){
        ArrayList<Integer>list=new ArrayList<>(); //this is the syntax to declare array list there some more let see
//        ArrayList<String>list2=new ArrayList<String>();
//        ArrayList<Boolean>list3=new ArrayList<Boolean>();
        //add element
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //get element
        int element=list.get(0);
        System.out.println("The 0th index element of array list is:"+element);

        //to add element in between .add element add im last but in between we do
        list.add(1,1);
                System.out.println(list);

                //set element
        list.set(0,5);
            System.out.println(list);

            //Delete element
        list.remove(3);
        System.out.println(list);

        //size
       int size= list.size();
       System.out.println(size);

        //loops
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println();
        //Sorting
        Collections.sort(list);
        System.out.println(list);
    }
}


//for using array list we need import java.util.ArraayList;