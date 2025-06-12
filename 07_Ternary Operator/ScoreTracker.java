import java.util.Scanner;
public class ScoreTracker {
    public static void main(String[] args) {
        System.out.println("Welcome to Score tracker");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your score : ");
        int num = input.nextInt();

        ScoreTracker ternary = new ScoreTracker();
        String score = ternary.check(num);
        System.out.println("Your Score is "+ score);
    }
    public String check(int num){
        String score = num > 80 ? "High"  : (num > 50)?"Moderate":"Low";
        return score;
    }
}
