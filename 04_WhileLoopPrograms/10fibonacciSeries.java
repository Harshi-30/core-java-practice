import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Welcome to the Fibonacci Series Generator");
       
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        
        int num = input.nextInt();
        printFibonacciSeries(num);
    }
    public static void printFibonacciSeries(int num){
        if (num < 0)return ;
        System.out.print(0 +" ");
        if (num == 0) return ;
        System.out.print(1 + " ");

        int first = 0,second = 1;
        while(first + second < num){
            int third = first+second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}