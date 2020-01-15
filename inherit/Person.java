package inherit;
import java.util.Scanner;

class Person{
    private int ID;
    private String MobileNo;

    public void readData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Give ID: ");
        this.ID = sc.nextInt();

        System.out.print("Give mobile number: ");
        this.MobileNo = sc.next();
    }

    public void printData(){
        System.out.println("ID: " + this.ID);
        System.out.println("Mobile No: " + this.MobileNo);
    }
}
