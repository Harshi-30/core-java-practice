import java.util.Scanner;
class PalindromeRecarsion {
    public static void main(String[] args) {
        System.out.println("Welcome to pelindrom");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.next();
        boolean isPelindrom = isPelindrom(str);
        if(isPelindrom){
            System.out.println("Your string is pelindrom");
        }else{
            System.out.println("Your string is not pelindrom");
        }
    }
    public static boolean isPelindrom(String str){
        if(str.length() < 1){
            return true;
        }
        int lastPos = str.length() -1;
        if(str.charAt(0) != str.charAt(lastPos)){
            return false;
        }
        String newStr =str.substring(1, lastPos);
        return isPelindrom(newStr);
    }
}
