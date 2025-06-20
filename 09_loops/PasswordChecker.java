import java.util.*;
class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;
        PasswordChecker pc = new PasswordChecker();
        do{
            System.out.print("Please Enter your pasword: ");
            password = input.next();
        }while(!pc.ischeckPaswword(password));
        System.out.println("Thanku for entering valid password");

         

    }
    
    public  boolean ischeckPaswword(String pass){
        return pass.length() > 6;
    }
    
}
