import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args){
        System.out.println("Welcome to Armstrong Number Checker");
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a number : ");
        int num = input.nextInt();

        boolean isAmstrong = isArmstrong(num);
        if (isAmstrong){
            System.out.println("Your number is an Armstrong number");
        }else {
            System.out.println("Your number is not an Armstrong number");

        }

    }
    public static boolean isArmstrong(int num){
    int digit = length(num);
    int copy = num;
    int finalnumber = 0;
    while(num > 0){
        int lastNumber = num % 10;
        num/=10;
         finalnumber += power(lastNumber ,digit);
    }

        return finalnumber == copy;
    }
    public static int power(int num1 ,int pow){
        int i = 1;
        int result = 1;
        while(i <= pow){
            result *= num1;
           i++;
        }
        return result;
    }
    public static int length(int num){
        int size = 0;
        while (num > 0){
            size ++;
            num /= 10;

        }
        return size;
    }
}