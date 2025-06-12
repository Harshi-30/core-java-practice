import java.util.Scanner;

class MinimumTernary{
    public static void main(String[] args) {
        System.out.println("Welcome to Minimum number finder");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number :");
        int num1 = input.nextInt();
        System.out.print("Enter Second number :");
        int num2 = input.nextInt();

        MinimumTernary Minimum = new MinimumTernary();
        int ternary = Minimum.minimumNumber(num1, num2);
        System.out.println(ternary + " is minimum number");
    }
    public int  minimumNumber(int num1 ,int num2){
        int minimumNum = num1 < num2 ? num1:num2;
        return minimumNum;
    }

}