import java.util.Scanner;
class AgeGroupClassifier {
    public static void main(String[] args) {
        System.out.println("Welcome to age group");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your age :");
        int age = input.nextInt();

        if(age < 13){
            System.out.println(" Hello, Child!");
        }else if(age < 20){
            System.out.println("Congratulations, you're a Teenager");
        }else if(age<60){
            System.out.println("You're an Adult now. Best of luck");
        }else {
            System.out.println("Take care, you're a Senior Citizen. ");
        }
    }
}
