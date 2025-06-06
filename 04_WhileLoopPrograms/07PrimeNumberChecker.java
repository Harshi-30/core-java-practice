import java.util.Scanner;

class PrimeNumberChecker {
    public static void main(String[] args) {
        System.out.println("Welcome to the Prime Number Checker");
       
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number :");
        int num = input.nextInt();
      
        boolean primeNo = isPrime(num);
        if (primeNo){
            System.out.println("Number is prime");
        }
        else {
            System.out.println("Number is not prime");
        }
    }
    public static boolean isPrime(int num){
        if (num < 2) return false;

        int i = 2;
        while(i < num){
            if (num % i == 0){

                return false;

            }
            i++;
        }

        return true;
    }
}