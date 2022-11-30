import java.util.Scanner;
public class Delimiters {
    public static void main(String[] argars){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers (on the same line)");
        int num1 = scan.nextInt();//read one int number 
        int num2 = scan.nextInt();// and then read next one even thought they are in same line

        System.out.println("Enter two very big integer (on the same line)");
        long bigNum1 = scan.nextLong();
        long bigNum2 = scan.nextLong();

        System.out.println("Enter two decimals (on the same line)");
        double decimal1 = scan.nextDouble();
        double decimal2 = scan.nextDouble();

        System.out.println("Enter two text values (on the same line)");
        String text1 = scan.next();
        String text2 = scan.next();

        scan.close();

        System.out.println("\tIntegers: " + num1 + " " + num2);
        System.out.println("\tBig Integers: " + bigNum1 + " " + bigNum2);
        System.out.println("\tDecimals: " + decimal1 + " " + decimal2);
        System.out.println("\tWords: " + text1 + " " + text2);
    }
    // scan.nextLine reads the current line
}
