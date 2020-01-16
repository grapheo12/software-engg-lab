package inherit;
import java.util.Scanner;

class PG extends Student{
    private String project;
    private String supervisor;

    public void readData(){
        super.readData();

        Scanner sc = new Scanner(System.in);
        System.out.print("Project: ");
        this.project = sc.next();

        System.out.print("Supervisor: ");
        this.supervisor = sc.next();

    }

    public void printData(){
        super.printData();

        System.out.println("Project: " + this.project);
        System.out.println("Supervisor: " + this.supervisor);
    }
}
