package basics;

public class ArrayExmpl2 {
    public static void main(String[] args) 
    {
        int [] arr=new int [10];

        arr[0]=10;
        arr[1]=4;
        arr[2]=3;
        arr[3]=7;
        arr[4]=9;
        arr[5]=-13;
        arr[6]=45;
        arr[7]=12;
        arr[8]=21;
        arr[9]=2;

        
        int mul=1;
        for (int i=0;i<arr.length;i++) {
           mul=mul*arr[i];
        
        }
        System.out.println(mul);

         

        

        
    }
    
}
