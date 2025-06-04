import java.util.Scanner;
class LeapYearChecker {
    public static void main(String[] args) {
        System.out.println(" Welcome to leap a year Calculate ");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter an year :");
        int year = input.nextInt();

        if(year%400 == 0 || (year%4 == 0 && year%100 !=0) ){
            System.out.println(" The year \" + year + \" is a leap year");
        }else{
            System.out.println(" The year \" + year + \" is not a leap year");
        }
    }
}
