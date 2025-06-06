import java.util.Scanner;

class LCM {
    public static void main(String[] args) {
        System.out.println("welcome to lcm Calculator");
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter first number : ");
        int first = input.nextInt();
        System.out.print("please enter second number :");
       
        int second = input.nextInt();
       
        int lcm = calculateLCM(first,second);
        System.out.print("your factor is : " + lcm);
    }
    public static int calculateLCM(int num1, int num2){
       int i = 1;
       int factor ;
       while(i <= num2){
           factor = num1*i;
           if(factor % num2 ==0){
                return factor;

           }
           i++;
       }
        return 0;
    }
}