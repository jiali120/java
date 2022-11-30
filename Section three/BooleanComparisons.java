public class BooleanComparisons {
    public static void main(String[] argas){

        int i=95;
        int j=75;
        System.out.println(i!=j);

        // never use == or != to String values
    //String use equals or !equals
        String sen1="I love";
        String sen2="I love you";
        System.out.println(!sen1.equals(sen2));

        // = sets a variable equal to a new value
        // == compares 2 values and returns a boolean

        double val=3.6;
        System.out.println((int)val==3);

    }
    
}
