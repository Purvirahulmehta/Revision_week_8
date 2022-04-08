package homework_week_8;
/*
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
import java.util.Scanner;

public class Programme_8_SymbolTringle {
    public static void symbolTringle(int n){
        for(int i =0; i <= n;i++){
            for(int j =0;j <i;j++){
                System.out.println("@");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        //scanner declaration for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of rows:");
        symbolTringle(scanner.nextInt());
        //closing the scanner object
        scanner.close();
    }
}
