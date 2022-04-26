package basics;

public class Stringempl {
    public static void main(String[] args) {
        String s="welcome to zensar";
        
        System.out.println(s.length());
        System.out.println(s.charAt(s.length()-1));
        System.out.println(s.substring(0,7));
        System.out.println(s.indexOf("z"));
        System.out.println(s.equals("mayur is java programmer"));
        System.out.println(s.replace("zensar","Wipro"));

        String []sarr=s.split("!");

        for(String str: sarr)
        {
            System.out.println(str);
        }
        System.out.println(reverse(s));
    }

    public static String reverse(String s)
    {
        String sr="";
        for(int i=s.length()-1;i<0;i--)
        {
            sr+=s.charAt(i);
        }

        return sr;
    }
}
