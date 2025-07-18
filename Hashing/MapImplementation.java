package Hashing;
import java.util.*;


public class MapImplementation {
    static class  HashMap<K,V>{
        private class Node{
            //K -key V-value when we give any other variable instead of datatypes key and value this is called GENERICS in java
            K key;
            V value;
            public Node(K key ,V value){                //Basically a node is made
                this.key=key;
                this.value=value;
            }
        }
        private int n;//number of nodes
        private int N;//number of buckets
        private LinkedList<Node> buckets[];          //Linkedlist which have data

        public HashMap(){                 //Haah map function
            this.N=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }
        private int hashFunction(K key){
    int bi=key.hashCode();         //bi is bucket index
   return  Math.abs(bi)%N;
        }
        private int searchInLL(K key,int bi){          //Search function in linked list
            LinkedList<Node> ll=buckets[bi];
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key==key) return i; //di
            }
            return -1;
        }

        private void rehash(){                                      //Rehash function to bucket list size
            LinkedList<Node> oldBucket[]=buckets;
            buckets=new LinkedList[N*2];

            for(int i=0;i<N*2;i++){
                buckets[i]=new LinkedList<>();
            }

            for(int i=0;i<oldBucket.length;i++){
                LinkedList<Node>ll=oldBucket[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.get(j);
                    put(node.key,node.value);
                }
            }
        }



            public void put(K key ,V value){              //put function is used to add data in array of linked list
            int bi=hashFunction(key);
            int di=searchInLL(key,bi);
            if(di==-1){
                //key doesn't exist
                buckets[bi].add(new Node(key,value));
                n++;
            }
            else {
                //key exist
                Node node=buckets[bi].get(di);
                node.value=value;
            }
            double lambda=(double) n/N; //here basically we are doing typecasting because n/N is int type
            if(lambda>2.0){
                 rehash();//rehashing
          }
             }
            public V remove(K key){                   //remove function is to remove data from arrayof linkedlist
                int bi=hashFunction(key);
                int di=searchInLL(key,bi);
                if(di==-1){
                    //key doesn't exist
                    return null;
                }
                else {
                    //key exist
                    Node node=buckets[bi].remove(di);
                    n--;
                    return  node.value;

                }
            }

            public ArrayList<K> keySet(){    //keyset function is used to get summary or overview of array of linked list
            ArrayList<K> keys=new ArrayList<>();  //basically this function will give all keys of the  hashmap
            for(int i=0;i<buckets.length; i++){
                LinkedList<Node>ll=buckets[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

            public boolean isEmpty(){      //this function basically do that array of linked list is empty
            return n==0;                    //basically it checks the hashmap is empty or not
            }



             public V get(K key){              //basically this function give all te values of keys
                 int bi=hashFunction(key);
                 int di=searchInLL(key,bi);
                 if(di==-1){
                     //key doesn't exist
                   return null;
                 }
                 else {
                     //key exist
                     Node node=buckets[bi].get(di);
                    return  node.value;
                 }
             }

             public boolean containsKey(K key){        //this function check whether the Key is conatined in hashmap or not
            int bi=hashFunction(key);
            int di=searchInLL(key,bi); //di=-1
            if(di==1){//key doesn't exist
               return false;
            }
            else{ //key exist
                return true;
            }
             }

    }
    public static void main(String[] args){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India",120);
        map.put("China",130);
        map.put("US",50);
        ArrayList<String>keys=map.keySet();
        for(int i=0;i<keys.size();i++){
            System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
        }
        map.remove("India");
        System.out.println(map.get("India"));
       System.out.println(map.containsKey("China")) ;
    }
}
// HashMap is internally linked as Array of linked list
// HashMap is unordered
