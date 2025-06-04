import java.util.Scanner;
class SimpleInterestCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to simple interest calculator");

        System.out.print("Please enter principal amount : ");
        Scanner src = new Scanner(System.in);
        int principal = src.nextInt();
        System.out.print("Please enter time (in year):");
        int time = src.nextInt();
        System.out.print("Please enter rate (% per annum):");
        int rate = src.nextInt();

        System.out.println("Simple interest :"+ (principal*time*rate)/100);
    }
}
