import java.util.Scanner;

class TowerOfHanoi{
    public static void toh(int n, char startName, char bufferName, char stopName){
	if (n == 0)
	    return;
	else if (n == 1){
	    System.out.printf("One disk moved from %c to %c.\n", 
		    startName, stopName);
	}else{
	    toh(n - 1, startName, stopName, bufferName);
	    toh(1, startName, bufferName, stopName);
	    toh(n - 1, bufferName, startName, stopName);
	}
    }

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the number of disks: ");
	int n = sc.nextInt();
	
	toh(n, 'A', 'B', 'C');
    }	
}

