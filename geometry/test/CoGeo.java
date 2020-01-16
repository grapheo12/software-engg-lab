package test;

import circle.Circle;

import java.util.Scanner;

public class CoGeo {
    public static void main(String[] args) {
        System.out.println("Enter number of circles to create: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.printf("Creating %d circles...\n", n);

        Circle circles[] = new Circle[n];
        for (int i = 0; i < n; i++){
            circles[i] = new Circle();
            System.out.printf("Circle %d => Center: (%.2f, %.2f), Radius: %.2f\n",
                    i, circles[i].getCenter().getX(), circles[i].getCenter().getY(), circles[i].getRadius());
        }

        int count = 0;
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if (circles[i].isInside(circles[j])) {
                    System.out.printf("Cirlce %d is inside Circle %d\n", i, j);
                    count++;
                }
            }
        }

        System.out.println("Probability of selected circle to be inside some circle: " + (double)count / (n * (n - 1)) );
        sc.close();
    }
}
