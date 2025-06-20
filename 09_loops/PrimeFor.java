import java.util.Scanner;
public class PrimeFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();

        PrimeFor pf = new PrimeFor();
        boolean isPrime = (pf.isPrime(num));
        if(isPrime){
            System.out.println("Your number is prime");
        }else{
            System.out.println("Your number is not prime");
        }

    }
    public boolean isPrime(int num){
       
        if (num <= 1)return false;
       
        for( int i = 2; i < num;i++){
            if(num % i == 0){
                return false;
            }
        }

        
        return true;
    }
}
