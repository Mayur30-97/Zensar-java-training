package basics;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your age");
        int age=sc.nextInt();
        System.out.println("Enter your name");
        String  name=sc.next();

        if(age>=18)
        {
            System.out.println(name +" "+ "is adult");
        }
        else
        {
            System.out.println(name +" "+" is not adult");
        }



        
    }
    
}
