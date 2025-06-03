import java.util.Scanner;
class FloatMultiplicationCalculator {
    public static void main(String[] args){

        System.out.println("Welcome to floating point Calculator");
        System.out.print("Please enter first number : ");
        Scanner input = new Scanner(System.in);
        float firstNum = input.nextFloat();
        System.out.print("Please enter Second number : ");

        float secondNum = input.nextFloat();
        System.out.println("Your product is : "+(firstNum * secondNum));

    }
}
