import java.util.Scanner;
public class Survey {
    public static void main(String[] argas){
//Scanner

        int counter=0;
        Scanner scan = new Scanner(System.in);
        //nextLine() --- waits for the user to enter a String
        System.out.println("\nWhat is your name?");
        //using string name store the user name
        String name = scan.nextLine();
        counter++;

        System.out.println("\nHow much you spend for the coffee in each day?");
        double coffePrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow many days you buy a coffe on one week?");
        int coffeDay = scan.nextInt();
        counter++;

        System.out.println("\nThank you "+name+" for answing "+counter+" times questions!");
        System.out.println("\nYou total spend $"+(coffePrice*coffeDay)+" for coffe in one week.");
        scan.close();
    }
    
}
