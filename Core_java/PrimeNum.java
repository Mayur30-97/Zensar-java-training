package Core_java;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();

        boolean f=false;

        if(n==0|| n==1)
        {
            f=true;
        }

        for(int i=2;i<=n/2;i++)
        {
            if(n%2==0)
            {
                f=true;
                break;
            }
        }

        if(f!=true)
        {
            System.out.println(n+" is a Prime Number");
        }
        else
        {
            System.out.println(n+" is not Prime Number");
        }
    }
}
