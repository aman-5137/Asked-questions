abstract class Employee{
    public abstract int calculateSalary();
    public abstract void displayInfo();
}
class Manager extends Employee {
    @Override
    public int calculateSalary() {
        return 50000;
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager Information.");
    }
}
class Programmer extends Employee{

    @Override
    public int calculateSalary() {
        return 100000;
    }

    @Override
    public void displayInfo() {
        System.out.println("Programmer information.");
    }
}


public class EmployeeAbstraction {
    public static void main(String[] args) {

        Manager obj1 = new Manager();
        System.out.println("Salary of Manager is:"+ obj1.calculateSalary());
        obj1.displayInfo();

        Programmer obj2 = new Programmer();
        System.out.println("Salary of Programmer is: "+obj2.calculateSalary());
        obj2.displayInfo();
    }
}
