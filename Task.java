abstract class Employee{
    String name;
    int empid;
    double salary;
Employee(String name,int empid){
    this.name=name;
    this.empid=empid;
}
abstract void CalculateSalary();
void setSalary(double salary){
    this.salary=salary;
}
void display(){
    System.out.println("name:"+name);
    System.out.println("employee:"+empid);
    System.out.println("salary:"+salary);
}
}

class FulltimeEmployee extends Employee{
   FulltimeEmployee(String name,int id){
    super(name,id);
   }
   void CalculateSalaryy(){                                                                                                                                                                                                              
    setSalary(30000+5000);
   }
    }
    void salary(){
        setSalary(500*20);
    }
    

public class Task{
    public static void main(String[]arg){
        Employee e;
        e=new FullTimeEmployee("ruchi",100);
        e.calculateSalary();
        e.display();
        System.out.println();
        e=new PartTimeEmployee("ruchitha",101);
        e.calculateSalary();
        e.display();
    }
}
