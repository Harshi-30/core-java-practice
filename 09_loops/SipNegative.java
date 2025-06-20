//import java.util.Scanner;
class SipNegative {
    public static void main(String[] args) {
        System.out.println("Welcome to breck continue");
        int[] myArr = MaxValue.getArray();

        
        int sum = 0;
        for(int num : myArr){
            
            if(num < 0){
                continue;
            }
            sum += num; 
        }
        System.out.println("Your sum is: "+ sum );
    }
}
