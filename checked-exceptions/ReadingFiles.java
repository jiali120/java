import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFiles {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("Greatings.txt");
            //after connecting to the file, you can read its data using scanner
            Scanner scan = new Scanner(fis);
            //using for loop keep running until scanner reads every single line from greeting file
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
            scan.close();
        }
        //if the code happends to fail, need to catch the file not found exception 
        catch(FileNotFoundException e){
            System.out. println(e.getMessage());
        }
        
                
    }
}
