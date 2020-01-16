import java.util.Scanner;

class Combiantion{
    public static int buff[];

    public static void printArray(int A[]){
	System.out.print("[ ");
	for (int x : A){
	    if (x != -1)
		System.out.print(x + " ");
	}
	System.out.println("]");
    }
    
    public static void swap(int A[], int i, int j){
	int tmp = A[i];
	A[i] = A[j];
	A[j] = tmp;
    }

    public static void combination(int A[], int i, int r){
	if (r == 0){
	    for (int j = i, k = 0; j < A.length; j++, k++){
		buff[k] = A[j];
		A[j] = -1;
	    }
	    printArray(A);
	    for (int j = i, k = 0; j < A.length; j++, k++)
		A[j] = buff[k];

	    return;
	}
	if (i == A.length)
	    return;
	
	int tmp = A[i];
	A[i] = -1;
	combination(A, i + 1, r);
	A[i] = tmp;
	combination(A, i + 1, r - 1); 
    }

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter set size: ");

	int n = sc.nextInt();

	int A[] = new int[n];
	for (int i = 1; i <= n; i++)
	    A[i - 1] = i;
	System.out.print("Enter value of r: ");
	buff = new int[n];
	int r = sc.nextInt();

	combination(A, 0, r);
    }
}


