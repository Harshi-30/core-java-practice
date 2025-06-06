import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        System.out.println("Welcome to the Palindrome Checker ");
       
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number :");
        
        int num = input.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if (isPalindrome){
            System.out.println("Your number is palindrome number");
        }else{
            System.out.println("Your number is not palindrome number");
        }
    }
    public static boolean isPalindrome(int num){
       int digits = reverse(num);
       return num == digits;

    }
    public static int reverse(int num){
        int result = 0;
        while (num > 0){
            int digit =num%10;
            result = result *10 +digit;
            num/=10;
        }
        return result;

    }
}