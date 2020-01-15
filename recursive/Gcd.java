import java.util.Scanner;

class Gcd{
    static int getGcd(int a, int b){
        if (a == b)
            return a;
        else if (a < b)
            return getGcd(b, a);
        else if (a % b == 0)
            return b;
        else
            return getGcd(b, a % b);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Give 2 positive integers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("GCD of the numbers is: " + getGcd(a, b));
    }
}
