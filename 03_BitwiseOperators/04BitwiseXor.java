
import java.util.Scanner;

class BitwiseXor {
    public static void main(String[] args) {
        System.out.println("Bitwise operators 'XOR' ");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first number :");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number :");
        int secondNumber = input.nextInt();
        int resultXOR = (firstNumber ^ secondNumber);

        System.out.println("Result :"+resultXOR);

    }

}
