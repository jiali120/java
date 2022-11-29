import java.util.Scanner;
public class ChanllengeVar {
    public static void main(String[] agars){

        Scanner scan= new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        String name = scan.nextLine();

        System.out.println("\nHow old are you?");
        int age=scan.nextInt();

        scan.close();
    }
    
}
