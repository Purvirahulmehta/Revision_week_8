package homework_week_8;

import java.util.Scanner;

public class Programme_2_MinAndMaxInputChallenge {
    public static void findMinAndMaxNumbers(){
        //Scanner declaration for users input
        Scanner scanner = new Scanner(System.in);
        int min =0;
        int max =0;
        boolean first = true;
        //while loop
        while (true){
            System.out.println("Enter the number:");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                if (first){
                    first = false;
                    min = number;
                    max = number;
                }
                if(number> max){
                    max=number;
                }
                if(number< min){
                    min = number;
                }
            } else {
                break;
            }
            scanner.nextLine();//handle input
             }
        System.out.println("Min = " + min + ", Max = " + max);
        scanner.close();
    }

    public static void main(String[] args) {
        findMinAndMaxNumbers();
    }
}
