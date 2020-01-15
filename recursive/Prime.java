import java.util.Scanner;
class Prime{
    static boolean isPrime(int n, int check){
        if (n == 2)
            return true;
        if (check >= n)
            return true;
        if (n % check == 0)
            return false;
        else
            return isPrime(n, check + 1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if (isPrime(n, 2))
            System.out.println("It is prime.");
        else
            System.out.println("It is not prime.");

    }

}
