import java.util.Scanner;

class ForTable {
    public static void main(String[] args) {
        System.out.println("Welcome to muliplication table");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
      

        
        for(int i = 1; i <= 10; i++ ){
            
            System.out.println(num +" x "+ i + " = "+ num*i );
        }
    }
}
