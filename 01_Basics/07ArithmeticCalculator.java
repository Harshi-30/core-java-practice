import java.util.Scanner;
 class ArithmeticCalculator {
    public static void main (String[] args){
        System.out.println("Welcome to Arithmetic Calculator");
      
        System.out.print("Please enter First number :");
        Scanner src =new Scanner(System.in);
        int firstNum = src.nextInt();
       
        System.out.print("Please enter Second number :");
        int secondNum = src.nextInt();

        System.out.println("Sum is : " +(firstNum + secondNum));
        System.out.println("Subtraction is :" + (firstNum - secondNum));
        System.out.println("Product is :" + (firstNum * secondNum));
        if(secondNum != 0){
            System.out.println("Division is :"+(firstNum / secondNum));
            System.out.println( "Modulus is :" +(firstNum % secondNum));
        }else{

            System.out.println("Division: cannot divide by Zero.");
            System.out.println("Modulus: Cannot calculate modules with zero.");
        }
    }
}
