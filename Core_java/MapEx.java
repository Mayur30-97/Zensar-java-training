package Core_java;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        Map<String,Integer> map= new HashMap<>();
        System.out.println("Map is Empty"+ map.isEmpty());

        map.put("mayur", 87467);
        map.put("pavan", 874534);
        map.put("amit", 8768476);
        map.put("akshay", 73945);
        map.put("mayur", 7989987);

        System.out.println("Map is Empty:"+ map.isEmpty());
        System.out.println("Key: mayur, value :"+ map.get("mayur"));
        System.out.println("key: pavan,value"+ map.get("pavan"));
        System.out.println("Key: amit, value"+ map.get("amit"));

        System.out.println("key : vachan is there?"+ map.containsKey("vachan"));
        System.out.println("value : 8768476 is there?"+ map.containsValue(8768476));

        map.remove("akshay");
        System.out.println("Key : akshay removed");

        map.put("sourabh", 879345);

        map.forEach((k,v)->{
            System.out.println("key :"+ k +",value :" +v );
        });
    }
}
