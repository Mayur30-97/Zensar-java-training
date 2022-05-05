package Core_java;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.UUID;

public class medicalshop {
    static  Queue<details> q=new ArrayDeque<>();
    public static details inputDetails()
    {
        Scanner sc= new Scanner(System.in);
        
        String id=UUID.randomUUID().toString();

        System.out.println("Enter Name");
        String name=sc.nextLine();

        System.out.println("Enter age");
        int age=sc.nextInt();

        System.out.println("Ener diseasename");
        String diseasename=sc.next();

        System.out.println("Eter your Phone No.");
        int phoneno=sc.nextInt();

        details d=new details(id, name, age, diseasename, phoneno);

        sc.close();

        return d;
    }

    public static void main(String[] args) {
        details d=inputDetails();

        q.add(d);

        q.forEach(e ->{
            System.out.println("ID:--"+ e.getId());
            System.out.println("Name:-"+ e.getName());
            System.out.println("Age:-"+ e.getAge());
            System.out.println("Disease:-"+ e.getDiseasename());
            System.out.println("phone no:-"+ e.getPhoneno());
        });
    }
    
}

class details{
    String id;
    String name;
    int age;
    String diseasename;
    int phoneno;
    public details(String id, String name, int age, String diseasename, int phoneno) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.diseasename = diseasename;
        this.phoneno = phoneno;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getDiseasename() {
        return diseasename;
    }
    public void setDiseasename(String diseasename) {
        this.diseasename = diseasename;
    }
    public int getPhoneno() {
        return phoneno;
    }
    public void setPhoneno(int phoneno) {
        this.phoneno = phoneno;
    }
    
    
}
