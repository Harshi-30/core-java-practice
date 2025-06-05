import java.util.Scanner;

class BitwiseLeftShift {

    public static void main(String[] args) {
        System.out.println("Bitwise Left Shift");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number :");
        int Num = input.nextInt();
        int result = Num<<1;
        System.out.println("Result iS "+ result);
    }
}