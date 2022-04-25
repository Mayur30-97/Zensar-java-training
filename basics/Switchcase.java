package basics;

import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your weight");

        int n=sc.nextInt();

        switch(n)
        {
            
            case 1:
            System.out.println("you are fat");
            break;
            case 2:
           
            System.out.println("you are thin");
            break;
            case 3:
           
            System.out.println("you are healthy");
            break;
            default:
            System.out.println("Enter worng chioce");
        }        
    }
    
}
