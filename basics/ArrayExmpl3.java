package basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExmpl3 {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int arr[]=new int [10];
        int n= arr.length;

        System.out.println("Enter a marks");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        int lowest= arr[0];
        int highest=arr[arr.length-1];

        int sum=0;

        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        int avg=sum/n;

        System.out.println("lowest marks: "+lowest);
        System.out.println("highest marks: "+highest);
        System.out.println("average marks: "+avg);

        


        
        
    }
}
