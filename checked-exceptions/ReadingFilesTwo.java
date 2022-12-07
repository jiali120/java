import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFilesTwo {
    //this code is low data function contains code that throws an exception
    //we can do 2 things. 1. we can use to try catch block inside the function
    //2. we can declare that the code inside this function could fail and throw a file not found exception
    public static void main(String[] args) {
        try{
            loadData("Greetingstxt");
        } catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        
    }

    public static void loadData(String name) throws FileNotFoundException {
            FileInputStream fis = new FileInputStream(name);
            Scanner scan = new Scanner(fis);
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
            scan.close();
    }

}
