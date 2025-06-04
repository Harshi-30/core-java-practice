import java.util.Scanner;
class EvenOddChecker {
    public static void main(String[] args){
        System.out.println("Welcome to Even Odd Checker ");
        Scanner input = new Scanner(System.in);
        System.out.print (" Please enter a Number :");
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.println("Number is Even.");
        }else {
            System.out.println("Number is Odd.");
        }
        System.out.println(" Thanku for join us");
    }
}
