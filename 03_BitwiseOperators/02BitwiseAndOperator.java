import java.util.Scanner;

class BitwiseAndOperator {
        public static void main(String[] args) {
            System.out.println("Bitwise operators 'AND' ");
            Scanner input = new Scanner(System.in);
           
            System.out.print("Please enter first number :");
            int firstNumber = input.nextInt();
            
            System.out.print("Enter second number :");
            int secondNumber = input.nextInt();
          
            int resultAnd = (firstNumber & secondNumber);

            System.out.println("Result :"+resultAnd);

        }

}
