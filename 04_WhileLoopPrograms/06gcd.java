import java.util.Scanner;

class GCDCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the GCD Calculator");
        Scanner input = new Scanner(System.in);
      
        System.out.print("please enter first number : ");
        int first = input.nextInt();
       
        System.out.print("Please enter second number : ");
        int second = input.nextInt();
       
        int gcd = calculateGCD(first ,second);
        System.out.print("your GCD is :" + gcd);
    }
    public static int calculateGCD(int num1, int num2){
        int i = 1;
        int fact = 1 ;
        int small = issmaler(num1 , num2);
        while(i <= small){
            if(num1 % i ==0 && num2 %i == 0){
                fact = i;
            }
            i++;
        }

        return fact;
    }
    public static int issmaler(int num1,int num2){
        if(num1<num2){
            return num1;
        }else {
            return num2;
        }
    }
}