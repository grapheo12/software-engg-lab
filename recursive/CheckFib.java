import java.util.Scanner;

class CheckFib{
    static boolean isFib(int n, int currFib, int prevFib){
       if (currFib > n){
        return false;
       }else if (n == currFib){
        return true;
       }else{
        return isFib(n, prevFib + currFib, currFib);
       }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if (isFib(n, 1, 1))
            System.out.println("It is a Fibonacci number.");
        else
            System.out.println("It is not a Fibonacci number.");
    }
}
