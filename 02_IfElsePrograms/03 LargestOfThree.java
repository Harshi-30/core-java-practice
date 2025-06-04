import java.util.Scanner;
class LargestOfThree {
    public static void main(String[] args){
        System.out.println("Welcome to the Greatest Number Finder ");
        System.out.print("Please enter First number : ");
        Scanner input = new Scanner(System.in);
        int numOne = input.nextInt();
        System.out.print("Please enter Second number :");
        int numTwo = input.nextInt();
        System.out.print("Please enter Third number :");
        int numThree = input.nextInt();


        if (numOne >= numTwo && numOne >= numThree){
            System.out.println("\n \nFirst number is greatest " + numOne);
        }else if(numTwo >= numThree){
            System.out.println("\n \nSecond number is greatest " + numTwo);
        }else{
            System.out.println("\n \nThird number is greatest " + numThree);
        }
    }
}
