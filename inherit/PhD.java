package inherit;
import java.util.*;

class PhD extends Student{
    private String thesis;
    private String area;
    private ArrayList<String> publication = new ArrayList<>();

    public void readData(){
        super.readData();

        Scanner sc = new Scanner(System.in);
        System.out.print("Thesis: ");
        this.thesis = sc.next();

        System.out.print("Area: ");
        this.area = sc.next();

        System.out.print("How many publications?  ");
        int n = sc.nextInt();

        System.out.println("Enter the publication details one in each line...");
        sc.next();
        while (n-- > 0){
            this.publication.add(sc.nextLine());
        }

    }

    public void printData(){
        super.printData();

        System.out.println("Thesis: " + this.thesis);
        System.out.println("Area: " + this.area);

        System.out.println("Publications: ");
        for (String x : this.publication){
            System.out.println(x);
        }
    }
}
