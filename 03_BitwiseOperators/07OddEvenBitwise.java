import java.util.Scanner;
class OddEvenBitwise {
    public static void main(String[] args) {
        System.out.println("Odd or Even using Bitwise Operator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = input.nextInt();

        if ((num & 1)==1){
            System.out.println("NUMBER IS Odd");
        }else{
            System.out.println("Number is even");
        }
    }
}
