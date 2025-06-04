import java.util.Scanner;
class NumberSignChecker {
    public static void main(String[] args){

        System.out.println("Welcome to Number Sign Checker");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to check : ");
        int number = input.nextInt();

        if ( number > 0){
            System.out.println(" Number is Positive");
        }else if(number < 0 ){
            System.out.println(" Number is negative");
        }else {
            System.out.println(" Number is Zero");
        }
    }
}
