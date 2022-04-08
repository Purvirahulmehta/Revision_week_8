package homework_week_8;

import java.util.Scanner;

public class Programme_14_DiamondPattern {
    public static void printDiamondPattern(int r ,char ch) {
        int i = 1;
        int j;
        while (i <= r) {
            j = 1;

            while (j++ <= r - i) {
                System.out.println(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.println(ch);
            }
            System.out.println();
            i++;
        }
        i = r - 1;
        while (i > 0) {
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.println(ch);
            }
            System.out.println();
            i--;
        }
    }

    public static void main(String[] args) {
        //scanner declaration for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of Row:");
        int a = scanner.nextInt();
        System.out.println("Enter the symbol:");
        char c= scanner.next().charAt(0);
        printDiamondPattern(a,c);
        //closing the scanner object
        scanner.close();
    }
}