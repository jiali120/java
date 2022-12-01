public class ReturnValues {
    public static void main(String[] argas){
       double area = calculateArea(2.3, 1.5);
       double area1 = calculateArea(0.3, 1.2);
        printArea(2.3, 3.5, area);

       String englishEx=explainArea("English");
       String frenchEx=explainArea("French");
       String spanishEx=explainArea("Spanish");
       String itaEx=explainArea("Italian");

    }
    //the return type is double
    public static double calculateArea(double objLength, double objWidth){ // it calls parameters
        double area = objLength * objWidth;
        return area;
    }

    public static String explainArea(String language){
        switch(language){
            case "English": return "Area equals length * width";
            case "French": return "La surface est egale a la longueur * la largeur";
            case "Spanish": return "area es igual a largo * ancho";
            default: return "language not available";
        }

    }  

    public static void printArea(double objLenght, double objWeight, double area){
        System.out.println(objLenght + objWeight + area);
    }
}
