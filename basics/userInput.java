package basics;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        System.out.println("you entered:"+ n);
    }
}
 