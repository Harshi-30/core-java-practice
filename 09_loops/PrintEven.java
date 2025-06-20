import java.util.Scanner;
class PrintEven {
    public static void main(String[] args){
        //int[] arr = MaxValue.getArray();

        // Scanner input = new Scanner(System.in);
        // System.out.print("Please enter a number: ");
        // int num = input.nextInt();
        
        for(int i = 1; i <= 10; i++){
        // for(int num : arr){
            if (i % 2 != 0){
            continue;
            }
            System.out.println("Number is "+ i);
         }
    }
}
