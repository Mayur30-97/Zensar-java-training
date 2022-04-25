package basics;

import java.util.Scanner;

public class tablewithwhile {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int number=sc.nextInt();
        int n=0;
        while(n!=10)
        {
            System.out.println((n+1)*number);
            n++;
        }
    }
    
}
