import java.util.Scanner;
class EvenAndOdd {
    public static void main(String[] args) {
        System.out.println("Welcome to Even Ode ");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();

        EvenAndOdd evenAndOdd = new EvenAndOdd();
        String Find = evenAndOdd.check(number);
        System.out.println("your number is " + Find);
    }
    public String check(int num){
        String number =( num % 2 == 0)? "even": "odd";
        return number;
    }
}
