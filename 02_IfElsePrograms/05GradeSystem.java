import java.util.Scanner;
class GradeSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to  Grade System");
       
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade :");
        int grade = input.nextInt();
        
        if (grade > 100 || grade < 0){
            System.out.println("Not valid number");
        } else if(grade >= 90 ){
            System.out.println("You got 'A' grade ");
        }else if(grade>=75 ){
            System.out.println("You got 'B' grade");
        }else if(grade>=60){
            System.out.println("You got 'C' grade");
        }else if(grade>=30 ){
            System.out.println("You got 'D' e");
        }else{
            System.out.println("Better luck next time ,you got 'F' (Fail)");
        }
    }
}
