import java.util.Scanner;

class Permutation{
    public static void printArray(int A[]){
	System.out.print("[ ");
	for (int x : A){
	    System.out.print(x + " ");
	}
	System.out.println("]");
    }
    
    public static void swap(int A[], int i, int j){
	int tmp = A[i];
	A[i] = A[j];
	A[j] = tmp;
    }

    public static void permute(int A[], int i){
	if (i == A.length){
	    printArray(A);
	    return;
	}
	for (int j = i; j < A.length; j++){
	    swap(A, i, j);
	    permute(A, i + 1);
	    swap(A, j, i);
	}
    }

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter set size: ");

	int n = sc.nextInt();

	int A[] = new int[n];
	for (int i = 1; i <= n; i++)
	    A[i - 1] = i;

	permute(A, 0);
    }
}


