import java.util.Scanner;
class ExitOnExit {
    public static void main(String[] args){
        System.out.println("Welcome to comund line");
        Scanner input = new Scanner(System.in);
        
        
        while(true){
            System.out.print("Enter your command");
            String command = input.next();

            if(command.equalsIgnoreCase("Exit")){
                break;
            }
        }
        System.out.println("you got the correct command");
    }
}
