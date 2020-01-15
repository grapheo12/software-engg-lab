import java.util.Scanner;

class Fib{
    static int fib(int n){
        if (n < 0){
            return -1;
        }else if (n == 0 || n == 1){
            return 1;
        }else{
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(n +"th Fibonacci number = " + fib(n));
    }
}
