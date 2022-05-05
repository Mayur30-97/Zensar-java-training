package Core_java;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        Set<Integer> s=new HashSet<>();

        s.add(10);
        s.add(87);
        s.add(48);

        s.add(87);

        s.remove(87);
        
        s.forEach(System.out::println);
    }
}
