package employeemanagement;

public class EmployeeManagement 
{

    
    public static void main(String[] args) 
    {
        //Passing Value To Employee Class
        Employee Emp1= new Employee();
        Emp1.setvalue("johnbaba","Kazi Nirjon",20000);
        Emp1.YearlySalary();
        
        Employee Emp2= new Employee();
        Emp2.setvalue("cinebirds","CINEBIRDS PICTURES",50000);
        Emp2.YearlySalary();
        
        //Taking Input From User
        
        Employee Emp3=new Employee();
        Emp3.inputvalue();
        Emp3.YearlySalary();
        
        //End Of Code
    }
    
}
