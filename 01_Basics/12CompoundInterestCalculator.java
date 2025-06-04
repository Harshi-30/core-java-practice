import java.util.Scanner;
class CompoundInterestCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to compound interest");
        System.out.print(" Please enter principal");
        Scanner src = new Scanner(System.in);
        int principal = src.nextInt();
        System.out.print("Enter the time :");
        double time = src.nextDouble();
        System.out.print("Enter rate");
        float rate = src.nextFloat();
        double Compound_interest = principal* Math.pow((1+rate/100),time);
        System.out.print("Compound interest is : " + Compound_interest);
    }
}
