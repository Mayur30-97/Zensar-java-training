package basics;

import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your weight");

        int n=sc.nextInt();

        int ch = -1;

        if(n >= 90) {
            ch = 0;
        } else if(n <= 30) {
            ch = 1;
        } else if(n >= 45 && n <= 65) {
            ch = 2;
        }

        switch(ch)
        {
            
            case 0:
            System.out.println("you are fat");
            break;
            case 1:
           
            System.out.println("you are thin");
            break;
            
            case 2:
           
            System.out.println("you are healthy");
            break;
            default:
            break;
        }        
    }
    
}
