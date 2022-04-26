package basics;
public class ArrayEmpl {
    public static void main(String[] args) 
    {
        int arr[]=new int[5];

        Object []obj=new Object[5];

        obj[0]="xyz";
        obj[1]=23;
        obj[2]='n';
        obj[3]='p';
        obj[4]="abc";
        
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=7;
        arr[4]=89;
        

        /*for (Object ob : obj) 
        {
            System.out.println(ob.toString());   
        }
*/      
        int sum=0;
        for(int i:arr)
        {
            sum=sum+i;
        }
        System.out.println(sum);



        
    }

}
