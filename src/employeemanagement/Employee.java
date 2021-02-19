package employeemanagement;
import java.util.Scanner;


public class Employee 
{
    String username;
    String name;
    double salary;
    
    public void setvalue(String USERNAME,String NAME,double SALARY)
    {
        username = USERNAME;
        name = NAME;
        salary = SALARY;
    }
    
    public void inputvalue()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Username");
        username=input.nextLine();
        System.out.println("Enter Your Name");
        name=input.nextLine();
        System.out.println("Enter Your Salary");
        salary=input.nextDouble();
        
       
    }
    
    public void YearlySalary()
    {
        double Ysalary=salary*12;
        System.out.println("yearly salary of "+name+" is "+Ysalary);
    }
    
}
