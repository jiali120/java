import java.util.Arrays;
public class UpdatingArrays {
    public static void main(String[] argas){
        String[] menu = {"Espresso", "Iced Coffee", "Latte"};
        menu[2]="milk Latte";
        System.out.println(Arrays.toString(menu));  

        //changing arrary length
        String[] newMenu = new String[5];

        for(int i=0; i<menu.length; i++){
            newMenu[i]=menu[i];
        }
        newMenu[3] = "House Blend";
        newMenu[4] = "Dark Roast";
        System.out.println(Arrays.toString(newMenu));

    } 
}
