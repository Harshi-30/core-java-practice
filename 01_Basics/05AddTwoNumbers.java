import java.util.Scanner;
class AddTwoNumbers{
    public static void main(String[] args){
        System.out.println("Welcome to our Calculator");
        System.out.print("Please enter first numbers : ");
        Scanner src = new Scanner(System.in);
        int a = src.nextInt();
        System.out.print("Please enter Second number : ");
        int b = src.nextInt();
        int sum = a + b;
        System.out.println("Your sum is : " + sum);
    }
}