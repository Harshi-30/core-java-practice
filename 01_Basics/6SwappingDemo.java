import java.util.Scanner;
class SwappingDemo{
    public static void main(String[] args){
        System.out.println("Welcome to swapping station");
        System.out.print("Enter your first number to swap :");
        Scanner input = new Scanner(System.in);
        int firstNum = input.nextInt();
        System.out.print("Enter your Second number to swap :");
        int secondNum = input.nextInt();
        System.out.println("Swapping done");
        int temp;
        temp = firstNum;
        firstNum = secondNum ;
        secondNum = temp;
        System.out.println("Your First number is :" + firstNum);
        System.out.println("Your Second number is :"+secondNum);
    }
}