import java.util.Scanner;
class BitwiseOrOperator {
    public static void main(String[] args) {
        System.out.println("Bitwise operators 'OR'");
        Scanner input = new Scanner(System.in);
       
        System.out.print("Please enter first number :");
        int firstNumber = input.nextInt();
       
        System.out.print("Enter second number :");
        int secondNumber = input.nextInt();

        int resultOR = (firstNumber | secondNumber);
       
        System.out.println("Result :"+resultOR);

    }
}
