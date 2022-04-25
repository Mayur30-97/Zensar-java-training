package basics;

public class Employee {
    int Empid;
    String name;
    double salary;
    String role;

    public Employee(int Empid, double salary, String role,String name)
    {
        this.Empid=Empid;
        this.salary=salary;
        this.role=role;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpid() {
        return Empid;
    }

    public void setEmpid(int empid) {
        Empid = empid;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee [Empid=" + Empid + ", name=" + name + ", role=" + role + ", salary=" + salary + "]";
    }

   
    
}

class EmployeeMain
{
    public static void main(String[] args) 
    {
        Employee e=new Employee(12345, 50000, "Sr.software Engineer", "abc");
        Employee e1=new Employee(45672, 30000, "Jr.software Engineer","xyz");

        System.out.println(e);
        System.out.println(e1);
        
    }
}
