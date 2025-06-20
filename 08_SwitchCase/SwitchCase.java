import java.util.Scanner;

class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Welcome to Switch case ");
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter a day  in number : ");
    int day = input.nextInt();
  //  oldSwitch(day);
    newSwitch(day);
    }

    public static void newSwitch(int day){
        String dayStr = switch(day){
            case 1,7 -> "Holady";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednasday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            default -> "Invalid day";
        };
        System.out.println(dayStr);
    }

    public static void oldSwitch(int day){
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;

                case 4:
                    System.out.println("Thursday");
                    break;
                    
                case 5:
                    System.out.println("Friday");
                    break;
                
                case 6:
                    System.out.println("Saturday");
                    break;
                
                case 7:
                    System.out.println("Sunday");
                    break;
                
                default:
                    System.out.println("Invalid day");
                    break;
            }
         
        }  
}