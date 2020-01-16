package inherit;
import java.util.*;

class Employee extends Person{
    private String employeeCode;
    private double salary;
    private String designation;
    private String doj;     //Date-of-joining

    public void printData(){
        super.printData();

        System.out.println("Employee Code: " + employeeCode);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
        System.out.println("Date of joining: " + doj);
    }

    public void readData(){
        Scanner sc = new Scanner(System.in);
        super.readData();
        System.out.print("Employee Code: ");
        this.employeeCode = sc.next();
        //sc.nextChar();
        System.out.print("Designation: ");
        this.designation = sc.next();
        //sc.nextChar();
        System.out.print("Date of joining[yyyy-mm-dd]: ");
        this.doj = sc.next();
        //sc.nextChar();
        System.out.print("Salary: ");
        this.salary = sc.nextDouble();
   }
            

}




