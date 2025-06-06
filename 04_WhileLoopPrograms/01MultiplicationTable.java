import java.util.Scanner;
class MultiplicationTable {
    public static void main(String[] args){
        System.out.println("Welcome to the Multiplication Table program.");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number:  ");
        int num = input.nextInt();
       multiplicationTable(num);
       
    }
    public static void multiplicationTable(int num){
        int i = 1;
        while( i <= 10){
            int product = i*num;
            System.out.println( num + " X " +i +  " = " + product );
            i++;
        }
         
    }

}
