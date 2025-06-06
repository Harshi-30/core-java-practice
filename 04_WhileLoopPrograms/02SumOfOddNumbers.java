import java.util.Scanner;

class SumOfOddNumbers {
    public static void main(String[] args){
        System.out.println("Welcome to Sum of Odd Numbers Calculator");
        Scanner input = new Scanner(System.in);
        System.out.print(" Please enter a number    :");
        int num = input.nextInt();
       
        int sum = sumOfOddNumber(num);
        System.out.println("Sum of odd numbers from 1 to " + num + " is: " + sum);

    }
    public static int sumOfOddNumber(int num){
        int i = 1;
        int sum = 0;
        while(i <= num){
            sum +=i;
            i+=2;
        }

        return sum;
    }
}