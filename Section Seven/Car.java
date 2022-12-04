import java.util.Arrays;
public class Car {

    //even thought fields are private, 
    //our public getters to return the fields as value 
    //and we have public setters to update them.
    private String make; //the class "make1"
    private double price;
    private int year;
    private String color;
    private String[] parts;
    
    public Car(String make, double price, int year, String color, String[] parts){// to this class "make11"
        
        this.make = make; //this is point the class "make1" and equal to this class's "make11"
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    public Car(Car source){//create a constructor that defines one parameter
        this.make=source.make;
        this.price=source.price;
        this.year=source.year;
        this.color=source.color;
        this.parts=Arrays.copyOf(source.parts, source.parts.length);
    }

    //getter no parameter, so getter will automatically refer to the object as field
    public String getMake(){
        return make;
    }

    //currently we have no way of updating an object as field
    // because they were made to be private to the class
    // so we need to add some public setters
    // setter receive a parameter
    public void setMake(String make){
        this.make = make;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String[] getParts(){
        return Arrays.copyOf(this.parts, this.parts.length);
    }
    public void setParts(String[] parts){
        this.parts = Arrays.copyOf(this.parts, this.parts.length);
    }

    public void drive(){
        //if change this.year to year also is fine
        System.out.println("\nYou bought the beautiful" + this.year + " " + this.color + " " + this.make + " " + "for " + this.price + ".");
        System.out.println("Please drive your car to the nearest exit.\n");
    }

    public String toString() {
        return "Make: " + this.make + ".\n" 
        +  "Price: " + this.price + ".\n"
        +  "Year: " + this.year + ".\n"
        +  "Color: " + this.color + ".\n"
        +  "Parts: " + Arrays.toString(parts) + ".\n";
    }
}
