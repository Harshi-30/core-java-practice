import java.util.Scanner;
public class TernaryOperater {
    public static void main(String[] args) {
        System.out.println("Wealcome to Ternaery operater");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number :");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number  :");
        int num2 = input.nextInt();
        
        int gratestNumber = num1 > num2 ? num1: num2;
        System.out.println(gratestNumber +" is gratest number");

        // if(num1 > num2){
        //     System.out.println(num1 +" is gratest number");
        // }else{
        //     System.out.println(num2 +" Is gratest number");
        // }
    }
}
