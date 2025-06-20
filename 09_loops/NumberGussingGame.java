import java.util.Scanner;
public class NumberGussingGame {
    public static void main(String[] args) {
        int gussingNum = 17;
        Scanner input = new Scanner(System.in);
        int num ;
        
        do{
            System.out.print("Enter any number between 1 to 100: ");
            num = input.nextInt(); 
        }while(num != gussingNum);

        System.out.println("Congratulation you win");
    }
    
}
