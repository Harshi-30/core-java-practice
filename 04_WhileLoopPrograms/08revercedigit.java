import java.util.Scanner;

class ReverseDigit {
    public static void main(String[] args) {
        System.out.println("Welcome to the Digit Reverser");
       
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = input.nextInt();
       
        int reverceDigit = reverseDigits(num);
        System.out.print("Your reverse digit is "+ reverceDigit);
    }
    public static int reverseDigits(int num){
       int reverse = 0;
       int digit;
       while (num > 0){
           digit = num %10;
           reverse = reverse *10 + digit;
           num /=10;
       }
        return reverse;
    }
}