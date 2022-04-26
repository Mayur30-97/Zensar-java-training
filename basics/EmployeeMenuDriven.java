package basics;

import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeMenuDriven {
    String Ename;
    String Erole;
    double Esalary;
    String dob;
    double exp;

    public EmployeeMenuDriven(String ename, String erole, double esalary, String dob, double exp) {
        Ename = ename;
        Erole = erole;
        Esalary = esalary;
        this.dob = dob;
        this.exp = exp;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String ename) {
        Ename = ename;
    }

    public String getErole() {
        return Erole;
    }

    public void setErole(String erole) {
        Erole = erole;
    }

    public double getEsalary() {
        return Esalary;
    }

    public void setEsalary(double esalary) {
        Esalary = esalary;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "EmployeeMenuDriven [Ename=" + Ename + ", Erole=" + Erole + ", Esalary=" + Esalary + ", dob=" + dob
                + ", exp=" + exp + "]";
    }
}

class EmployeeSys
{
    static Scanner sc= new Scanner(System.in);

    private static  EmployeeMenuDriven addEmployee()
    {
        Scanner sc1 =new Scanner(System.in);
        System.out.println("Enter the Employee Name");
        String Ename=sc1.nextLine();
        
        Scanner sc2 =new Scanner(System.in);
        System.out.println("Enter the Employee Role");
        String Erole=sc2.nextLine();
        
        System.out.println("Enter the Employee Salary");
        double Esalary=sc.nextDouble();
        
        Scanner sc3 =new Scanner(System.in);
        System.out.println("Enter the Employee DOB(dd/mm/yy)");
        String DOB=sc3.nextLine();
        String d=DOB.split("/")[0];
        String m=DOB.split("/")[1];
        String y=DOB.split("/")[2];

        System.out.println(LocalDate.of(Integer.parseInt(y),Integer.parseInt(m),Integer.parseInt(d)));
        
        System.out.println("Enter the Employee Experience");
        double EXP=sc.nextDouble();

        EmployeeMenuDriven emp= new EmployeeMenuDriven(Ename, Erole, Esalary, DOB, EXP);
        System.out.println("Employee added Successfully");
        System.out.println(emp);
        return emp;
    }
        public static void main(String[] args) {
            while(true)
            {
                System.out.println("1. Add an Employee");
                System.out.println("2. Exit the Program");
                System.out.println("Enter your choice:-");

                int choice= sc.nextInt();

                switch(choice)
                {
                    case 1 :
                    addEmployee();
                    break;

                    case 2 :
                    System.out.println("Thanks for using our Employee System");
                    System.exit(0);
                    break;

                    default:
                    break;
                }
            }
        }
    
}
