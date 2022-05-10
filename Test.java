import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test

{

    public static void main(String[] args)

    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter String length: ");
        int n=sc.nextInt();

        System.out.println("Enter String : ");

        String arr[]=new String[n];
        for(int i=0;i<n;i++)

        arr[i]=sc.next();

 

        int len=0;

        List<String>  oddLength=new ArrayList<String>();

        for(int i=0;i<n;i++)

        {

            len=arr[i].length();

            if(len%2==1)

            oddLength.add(arr[i]);      

        } 

        if(oddLength.size()==0)

             System.out.println("Better luck next time");

        else

        {

            Iterator itr=oddLength.iterator();

            int max=-1;

            String ans="";

            while(itr.hasNext())

            {

                String p=(String)itr.next();

                if(p.length()>max)

                {

                    ans=p;    

                    max=p.length();

                }

             }

            System.out.println(ans);

        }

        sc.close();
    }

}

