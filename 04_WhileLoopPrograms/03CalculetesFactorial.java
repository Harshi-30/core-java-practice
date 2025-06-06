import java.util.Scanner;

class CalculateFactorial {
    public static void main(String[] args) {
        System.out.println("Welcome to factorial");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number  :");
        long num = input.nextLong();
        if(num < 0){
            System.out.println("Factorial is not defined for negative numbers.");
        }else {long factorial = factorial(num);
        System.out.println("Factorial of " + num + " is: " + factorial);
        }
        
    }
    public static long factorial(long num){
       if(num == 0 || num == 1) return 1;
        int i = 2;
        long product = 1;
        while(i <= num){
            product *=i;

            i++;
        }
        return product;
    }
}