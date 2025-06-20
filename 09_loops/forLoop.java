import java.util.Scanner;
public class forLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        //int i = 0;
        // while(i <= 100){
        //     System.out.println(i);
        //     i++;
        // }
        // for(int i = 0;i <= 10;i++){
        //     System.out.println(i);
        // }
        
        int result = 1;
        for(int j = 1; j <= num; j++){
            result *=j;
        }System.out.println(result);

    }
    
}
