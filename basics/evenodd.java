package basics;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        
        if(n%2==0)
        {
            System.out.println(n +"is even");

        }
        else
        {
            System.out.println(n +"is odd");
        }
    }
}
