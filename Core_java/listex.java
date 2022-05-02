package Core_java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;



public class listex {

    public static List<Integer> convertIntoList()
    {
        int []arr={10, 30, 65, 67, 89, 35};

        List<Integer>list1=new ArrayList<>();

        for (int i : arr) {
            list1.add(i);
        }

        return list1;
    }
    public static void main(String[] args) 
    {
        ArrayList<Integer> list=new ArrayList<>();
        
        list.add(65);
        list.add(98);
        list.add(43);
        list.add(-67);
        
        list.remove(3);
        list.add(3, 54);
        System.out.println(list);

        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(list.contains(98));
        System.out.println(list.indexOf(65));
        
        System.out.println("1) Elements :- ");
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

        System.out.println("2) Elements :- ");
        for (int e : list) {
            System.out.println(e);
        }

        System.out.println("3) Lamda :- ");
        list.forEach(e -> System.out.println(e));

        System.out.println("4) Enhanced :-");
        list.forEach(System.out::println);

        System.out.println("5) Iterator :- ");
        Iterator<Integer> it=list.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("Array coverted into list :-" +convertIntoList());

    }
}

class f implements Consumer<Integer>
{
    @Override
    public void accept(Integer t) {
        System.out.println(t);
    }
}
