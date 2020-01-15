import java.util.Scanner;

class ScannerInput{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println("Max value: " + Math.max(a, Math.max(b, c)));
    }
}
