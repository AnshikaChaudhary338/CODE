package JAVA.ARRAYS;

import java.util.Scanner;

public class CreatingArray {
    public static void main(String[] args) {
        int marks[] = new int[3];
        Scanner sc = new Scanner(System.in);
        // int phy;
        // phy = sc.nextInt();

        System.out.println("Enter your marks of physics: ");
        marks[0] = sc.nextInt(); // phy
        System.out.println("Enter your marks of chemistry: ");
        marks[1] = sc.nextInt(); // chem
        System.out.println("Enter your marks of mathematics: ");
        marks[2] = sc.nextInt(); // math

        System.out.println("phy = " + marks[0]);
        System.out.println("chem = " + marks[1]);
        System.out.println("math = " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage" + percentage + "%");
    }

}
