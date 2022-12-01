import java.util.Scanner;
public class Parameters {
    public static void main(String[] argas){
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the box lenght?");
        double objLength = scan.nextDouble();

        System.out.println("What is the box width?");
        double objWidth = scan.nextDouble();

        //calculateArea(2.5, 3.0) it calls "arguments"
        calculateArea(objLength, objWidth);
    }

    public static void calculateArea(double objLength, double objWidth){ // it calls parameters
        double area = objLength * objWidth;
        System.out.println("Area: " + area);
    }
    
}
