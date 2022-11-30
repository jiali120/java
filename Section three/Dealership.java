import java.util.Scanner;

public class Dealership {
    public static void main(String[] agaris){

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the java dealership.");

        System.out.println(" -- Select option 'a' to buy a car");
        System.out.println(" -- Select option 'b' to buy a car");

        String option = scan.nextLine();

        switch(option){
            case "a": 
                System.out.println("What is you budget?");
                int budget = scan.nextInt();
                if(budget>=10000){
                    System.out.println("Great! small car available");
                    System.out.println("\n do you have insurance? 'yes' or 'no'");
                    scan.nextLine();
                    String insurance = scan.nextLine();

                    System.out.println("\nDo you have a license? 'yes' or 'no'");
                    //scan.nextLine();
                    String license = scan.nextLine();

                    System.out.println("\nwaht is you credit score?");
                    int score = scan.nextInt();

                    if(insurance.equals("yes") && license.equals("yes")&& score>660){
                        System.out.println("sold!");
                    } else{
                        System.out.println("we are sorry. you oculd not buy it.");
                    }

                }else{
                    System.out.println("no car are availabl");
                }
                break;

            case "b": 
                System.out.println("\nwhat is your car valued at?");
                int value=scan.nextInt();
                System.out.println("\nwhat is your saling price?");
                int price = scan.nextInt();

                if(value>price && price < 30000){
                    System.out.println("\nwe will buy your car");
                } else{
                    System.out.println("\nsorry not interested it");
                }
                break;
            default: System.out.println("\ninvalid option");
        }
        scan.close();
    }
    
}
