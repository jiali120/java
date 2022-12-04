public class Dealership {
    private Car[] cars;

    public Dealership(Car[] cars) {
        this.cars = new Car[cars.length];
        for(int i=0; i<this.cars.length;i++){
            this.cars[i] = new Car(cars[i]);
        }
    }

    public void sell(int index){
        this.cars[index].drive();
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking Spot: " + i + "\n";
            String carDescription = this.cars[i].toString();
            temp += carDescription + "\n";
        }
        return temp;
    }
    
    
}


//primitive type: most basic data type --- int, double, long, boolean, char
//primitive type: represent a value, cannot be null, have no methods
//class types: Dealership and Car a re class types
//class types: store a referece that points to an object, can be null, can call methods from its class

//primitive fixed memory size, but class types dont have a fixed memory size

// int a = 3 : primitive
// int[] z = new int[3] : object

//String objects are immutable. You cannot update a String object. You can only set the variable equal to a brand new String object. You will learn more about Mutable vs Immutable objects in the next section.