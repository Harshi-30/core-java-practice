import java.util.Scanner;
class MonthOfYear {
public static void main(String[] args) {
    System.out.println("Welcome to month mapping");
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter month in number: ");
    int num = input.nextInt();

    MonthOfYear month = new MonthOfYear();
    String result = month.getmonth(num);
    System.out.println("your month is "+ result);
}
        public String getmonth(int num){

            return switch(num){
                case 1 ->"January";
                case 2 ->"February";
                case 3 -> "March";
                case 4 -> "April";
                case 5 -> "May";
                case 6 -> "June";
                case 7 -> "July";
                case 8 -> "August";
                case 9 -> "September";
                case 10 -> "October";
                case 11-> "November";
                case 12 -> "December";
                default -> "Invalid Month";
            };
           
        }
}
