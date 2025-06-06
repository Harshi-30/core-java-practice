import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Welcome to the Sum of Digits Calculator");
        Scanner input = new Scanner(System.in);
        System.out.print(" Please enter a number :");
        
        int num = input.nextInt();
        
        int sum = sumOfDigits(num);
        System.out.println(" your sum is :" + sum);

    }
    public static int sumOfDigits(int num){
       int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /=10;
        }

        return sum;
    }
}