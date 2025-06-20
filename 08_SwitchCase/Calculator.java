import java.util.*;
class Calculator {
        public static void main(String[] args) {
            System.out.println("Welcome to calculator");
           
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter first number: ");
            int num1 = input.nextInt();
            System.out.print("Please enter second number: ");
            int num2 = input.nextInt();
           
            System.out.print("Enter your choice(+, -, *, /) :");
            String operation = input.next();

            Calculator results = new Calculator();
            int Answer = results.calculat(operation, num1, num2);
            System.out.println("Your answer is: "+Answer);
           
         }


        
            public int calculat(String operation, int num1, int num2){
               return switch(operation){

                
                    case "+" -> num1 + num2;
                    case "-" -> num1 - num2;
                    case "*" -> num1 * num2;
                    case "/" -> (num2 != 0)? num1 / num2:0;
                    default -> -1;

                };
               
            }
    
}
