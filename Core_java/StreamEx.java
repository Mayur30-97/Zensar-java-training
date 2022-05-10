package Core_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StreamEx {
    public static void main(String[] args) {
        List<Integer> l =new ArrayList<>();
        Scanner sc= new Scanner(System.in);
         
        l.add(2);
        l.add(8);
        l.add(89);
        l.add(23);
        l.add(10);

        System.out.println("1)Even numbers :-");
       for (int i: l) {
           if(i%2==0)
           {
               System.out.println(i);
           }
       }

       System.out.println("2) Even numbers");
       l.stream().filter(e-> (e%2==0)).sorted().forEach(System.out::println);

       System.out.println("3) convert list into map");
       l.stream().filter(e-> (e%2==0)).sorted().
      collect(Collectors.toMap(e-> e, Function.identity()))
       .forEach((k,v)-> System.out.println("key :"+  k +", value :"+v));

        System.out.println(l.stream().findAny());
        
        System.out.println(l.stream().equals(3));

        System.out.println(l.stream().count());

        
        


    }
}
