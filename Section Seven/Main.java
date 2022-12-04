import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        Car[] cars = new Car[] {
            new Car("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
            new Car("Dodge", 8500, 2019, "blue", new String[] {"tires", "keys"}),
            new Car("Nissan", 5000, 2017, "yellow", new String[] {"tires", "filter"}),
            new Car("Honda", 7000, 2019, "orange", new String[] {"tires", "filter"}),
            new Car("Mercedes", 12000, 2015, "jet black", new String[] {"tires", "filter", "transmission"})
        };
        
        Dealership dealership = new Dealership(cars);
        

        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");        
        System.out.println("Feel free to browse through our collection of cars.\n");
        System.out.println(dealership);
        System.out.println("Which car are you interested in? (0 – 4).\n");
        int index = scan.nextInt();

        // sell car here... 
        dealership.sell(index);
        
        scan.close();

    }


       
       // Dealership dealership = new Dealership(cars);

       // cars[3] = new Car("Hyudai", 7000, 2022, "white", new String[] {"tires", "keys"});
        
        //String[] spareParts = new String[] {"Tires", "Keys"};
        //Car nissan = new Car("Nissan", 10000, 2020, "Green", new String[] {"Tires", "Keys"}); 
        //String[] carParts=nissan.getParts();
        //carParts[0] = "Filter"; 
        //Car dodge= new Car("DODGE", 11000, 2021, "Black", new String[] {"Tires", "Keys"});

        //spareParts[0] = "Filter";
        //Car nissan2 = new Car(nissan);//call the copy constructor as you creat a new car object
        //nissan2.setColor("Yellow");

        //nissan2.drive();

        //nissan.setColor("Orange");
        //nissan2.setColor("Blue");
        //nissan.setColor("Purple");
        //nissan2.setColor("Fuchsia");
        //nissan.setColor("Beige");
        //nissan.setColor("Jet Black");
        //dodge.setYear(2022);

        //nissan.setPrice(nissan.getPrice()/2); //50% discount

        /*System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() + 
        ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");
        System.out.println("This " + dodge.getMake() + " is worth $" + dodge.getPrice() + 
        ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() + ".\n");*/
        //System.out.println(nissan);
}
    
