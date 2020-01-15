package inherit;
import java.util.*;

class Student extends Person{
    private String category;
    private String rollNo;
    private String dept;
    private ArrayList<Integer> marks = new ArrayList<Integer>();

    public void printData(){
        super.printData();
        System.out.println("Category: " + this.category);
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Department: " + this.dept);
        
        System.out.println("Marks: ");
        for (int x : this.marks){
            System.out.print(x + " ");
        }
        System.out.println("");
    }

    public void readData(){
        Scanner sc = new Scanner(System.in);
        super.readData();
        System.out.print("Category: ");
        this.category = sc.next();
        System.out.print("Roll No: ");
        this.rollNo = sc.next();
        System.out.print("Department: ");
        this.dept = sc.next();

        System.out.println("Enter the number of marks you want to enter: ");
        int n = sc.nextInt();
        System.out.println("Enter the marks: ");
        while (n-- > 0){
            this.marks.add(sc.nextInt());
        }
    }
            

}




