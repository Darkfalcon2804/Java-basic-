package Hashing;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args){
        HashMap<String,Integer>map=new HashMap<>();
    //Inserton
        map.put("India",120);
        map.put("US",120);
        map.put("China",120);
        System.out.println(map);
        //HashMap and HashSet are unordered
        map.put("China",180);//it will update the china key value
        System.out.println(map);

        //Search
        // //hashmap have two search operations 1. key exist karti hai ya nhii for this we use function=> containsKey
       //2nd function is get function

        if(map.containsKey("China")){
            System.out.println("key is present in the map");
        }
        else{
            System.out.println("Key is not present in the map");
        }
        System.out.println(map.get("China"));//key EXISTS
        System.out.println(map.get("Indonesia"));//key doesn't exist
        //two different traversing methods in array
        // first normal traversing
//    int arr[]={12,15,18};
//    for(int i=0;i<3;i++){
//        System.out.print(arr[i]+" ");
//    }
//    System.out.println();
//    //second variable traversing
//    for(int val:arr){
//        System.out.print(val+" ");
//    }
//    System.out.println();
    //this topi for understanding or developing a logic for further topic
        //to apply for loop in HashMap is Map.Entry<Integer,Integer>e:Map.entrySet();  in this e is element and in bracket there are two dataTypes one for key and another for value
        //and to use this we need to import java.util.Map;
        for(Map.Entry<String,Integer>e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        //Another way but not best one best one is this only
        //Another way=>
//        Set<String> keys=map.keySet();   //to use this we need to import java .util.Set
//    for(String key:keys){
//        System.out.println(key+" "+map.get(key) );
//    }

        //Remove
        map.remove("China");
        System.out.println(map);
    }
}


//HashMap basically have two component key and value.So value can be same in any type of condition but key is not  same for any condition it totally unique
//Declaration of Hashmap is like HashMap<Key(Datatype),value(Datatype)>i=new HashMap<>(); where i is hashmap variable