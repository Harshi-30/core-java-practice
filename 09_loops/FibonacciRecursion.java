import java.util.Scanner;
class FibonacciRecursion {
    public static void main(String[] args) {
        System.out.println("Welcome to fibonacci serises");
       
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the number ");
        int position = input.nextInt();
        
        for(int i = 1; i < position;i++){
            System.out.println(fibonacci(i)+"");
        }
        
       
    }
        public static int fibonacci(int position){
            if(position == 1){
                return 0;
            }
            if (position == 2){
                return 1;
            }
            return fibonacci(position -1)+ fibonacci(position -2);
        
    }
}
