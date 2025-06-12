import java.util.*;
class Absolutetarnary {
    public static void main(String[] args) {
        System.out.println("Welcome to Absolut Number");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = input.nextInt();

        Absolutetarnary Result = new Absolutetarnary();
        int result = Result.absolut(num);
        System.out.println("Your number is: " +result);


    }
    public int absolut(int num){
        int number = num >= 0 ? num : -num ;
        return number;
    }
}
