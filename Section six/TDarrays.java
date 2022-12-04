import java.util.Arrays;
public class TDarrays {
    public static void main(String[] argars){

        //int[][] grades = new int[3][4];

        int[][] grades = {
            {72,75,77,78},
            {53,67,69,61},
            {92,95,93,99}
        };

       // System.out.println(Arrays.toString(grades[0]));
       // System.out.println(Arrays.toString(grades[1]));
       // System.out.println(Arrays.toString(grades[2]));

        //for(int j=0; j<grades[0].length; j++){
            //System.out.println(grades[0][j]);
        //}

// i means row, j means clomn
        for(int i=0; i<grades.length; i++){
            switch(i) {
                case 0: System.out.println("\tRow 1: ");
                case 1: System.out.println("\tRow 2: ");
                case 2: System.out.println("\tRow 3: ");
            }
            for(int j=0; j<grades[i].length;j++){
                System.out.println(grades[i][j] + " ");
            }
        }

    }
    
}
