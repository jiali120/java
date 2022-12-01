import java.util.Scanner;
public class DiceJack {
    public static void main(String[] argas){
        Scanner scan = new Scanner(System.in);
        int roll1= rollDice();
        int roll2= rollDice();
        int roll3= rollDice();

        System.out.println("Enter 3 numbers between 1 to 6");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if(num1<1 || num2<1 || num3<1){
            System.out.println("Numbers cannot be less than 1.");
            System.exit(0);
        }

        if(num1>6 || num2>6 || num3>6){
            System.out.println("Numbers cannot be higher than 6.");
            System.exit(0);
        }

        int sumOfNumber = num1+num2+num3;
        int sumDiceRolls = roll1+roll2+roll3;
        System.out.println("Dice sum = " + sumDiceRolls + ". Number sum = " + sumOfNumber);


        scan.close();

    }
    public static int rollDice(){
        double randomNumber=Math.random()*6; //0-5.9999999
        randomNumber+=1;//1-6.99999999
        return (int)randomNumber; //1-6
    }
    
    public static void checkWin(int sumDiceRolls, int sumOfNumber){
        if(sumOfNumber>sumDiceRolls && sumOfNumber - sumDiceRolls<3){
            System.out.println("You Win");
        }else{
            System.out.println("You Lose");
        }

        //boolean
        //public static boolean checkWin(int sumDiceRolls, int sumOfNumber){
           // return (sumOfNumber>sumDiceRolls && sumOfNumber - sumDiceRolls<3);
    }
}//double number = (int)Math.random() * 6;  result always is 0
