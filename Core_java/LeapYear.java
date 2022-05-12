package Core_java;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Leap years from 2022 to next 50 years");
        for(int i=2022;i<=2072;i++)
        {
            if(i%4==0)
            {
                System.out.println(i);
            }
        }
    }
}
