import java.util.Scanner;
class BitwiseComplement {
    public static void main(String[] args) {
        System.out.println("Showcase  bitwise compliment");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a number :");
        int num = input.nextInt();
       
        int result = ~num;
       
        System.out.println("Result iS "+ result);
    }
}
