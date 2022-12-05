public class Item {
    
    /**Add the necessary fields to the Item class. Protect each field using the private keyword. */
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Item(Item source){
        this.name = source.name;
        this.price = source.price;
        this.quantity = source.quantity;
    }
    
    /**add a constructor, getters, and setters. */
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    } 
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    } 

    public String toString(){
        return this.name + ": " + this.price + " ("+this.quantity+")";
    }
}
