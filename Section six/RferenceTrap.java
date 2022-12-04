import java.util.Arrays;
public class RferenceTrap {
    public static void main(String[] argars){
        String[] staffLastYear = {"Tommy", "Jone", "Jess"};
        String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);
        staffThisYear[1] ="Abby";

        System.out.println(Arrays.toString(staffThisYear));
        System.out.println(Arrays.toString(staffLastYear));

    }
    
}
