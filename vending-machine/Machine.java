public class Machine {
    private Item[][] items;

    //first, we need constructor, getter amd setter
    //the constructor is public, as always share the same name with the class name 
    public Machine(Item[][] items){
        //first set the field equal to a new 2D array
        //first[] is items row, the second bracket refers to the number of elements in each row, so we can pick any row from the items parameter
        this.items = new Item[items.length][items[0].length];
        for (int i = 0; i < items.length; i++) {//outer loop runs through every row i是表示每行
            for (int j = 0; j < items[i].length; j++) {//inner loop needs to run through every element in that row， 把第一行的每个元素走一遍，然后i到第二行，j再把第二行每个元素走一遍
                //the constructor is going to update every element in the items field with an object from the items parameter.
                this.items[i][j] = new Item(items[i][j]);
            }
        }
    }
    
    public Item getItem(int row, int spot) {
        //this getter will be return a new item copy of the objcet
        return new Item(this.items[row][spot]);
    }
    
    public void setItem(Item item, int row, int spot) {
        //an item object that you are going to use to update one of your elements, the row and spot of the object you want to update
        this.items[row][spot] = new Item(item); // set it eaqual to a ne copy of the object being passed in
    }
    
    /**
     * Function name – dispense
     * @param row (int)
     * @param spot (int)
     * @return (boolean)
     * 
     * Inside the function:
     *  1. Checks if the requested item has a quantity bigger than 0.
     *      • if so: decreases its quantity by one and returns true.
     *      • otherwise: returns false.
     */


    public boolean dispense(int row, int spot) {
        if (this.items[row][spot].getQuantity() > 0) {
            items[row][spot].setQuantity(items[row][spot].getQuantity() - 1);
            return true;
        } 
        return false;
    }

    public String toString() {

        String temp = "";
        for (int i = 0; i < items.length; i++) {
            temp += "\t";
            for (int j = 0; j < items[i].length; j++) {
                //append each elemnt to the temp variable that we are returning
                temp += items[i][j].toString() + " ";
            }
            temp += "\n\n";
        }
        temp += "\t************************************************";
        return temp;
    }
}
