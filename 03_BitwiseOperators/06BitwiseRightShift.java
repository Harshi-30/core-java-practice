import java.util.Scanner;

class BitwiseRightShift	 {

        public static void main(String[] args) {
            System.out.println("Bitwise Right Shift");
           
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter a number :");
           
            int Num = input.nextInt();

            int result = Num >> 2;

            System.out.println("Result iS "+ result);
        }
    }