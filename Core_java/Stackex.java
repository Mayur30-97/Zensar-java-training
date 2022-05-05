package Core_java;

import java.util.Stack;

import javax.sql.rowset.spi.SyncResolver;

public class Stackex {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(10);
        s.push(36);
        s.push(87);

        s.pop();

        System.out.println(s.isEmpty());
        s.forEach(System.out:: println);
    }
}
