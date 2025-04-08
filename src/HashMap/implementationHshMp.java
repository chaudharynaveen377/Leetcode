package HashMap;

import java.util.HashMap;

public class implementationHshMp {
    public static void main(String[] args) {
//        work as a key->value<-pair
        HashMap<String,Integer> mp=new HashMap<>();
        mp.put("naveen",23);
        mp.put("chaudhary",43);
        mp.put("Akash",43);
        mp.put("lav",43);
        mp.put("harry",43);
//        getting value of a key from thet hashmap
        System.out.println(mp.get("naveen"));
        System.out.println(mp.get("rahul"));

//      changing/updating value of a key in hashmap
        mp.put("naveen",34);

//      removing a pair from hashmap..null if doesn't exist
        mp.remove("naveen");

//        checking if key is in the hashmap
        System.out.println(mp.containsKey("naveen"));
        System.out.println(mp.containsKey("Akash"));

//        adding a new entry only if the new key doesn't exist already
        mp.putIfAbsent("naveen",34);

//        get all keys in the hashmap
        System.out.println(mp.keySet());

//        get all the values
        System.out.println(mp.values());

//        ?get all entries in hashmap
        System.out.println(mp.entrySet());

//        traversing all entries of hashmap
        for (String key : mp.keySet()){
            System.out.printf("Age of %s is %d\n",key,mp.get(key));
        }
        for (var e:mp.entrySet()){
            System.out.printf("%s and %d \n",e.getKey(),e.getValue());
        }

    }
}
