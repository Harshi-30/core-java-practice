import java.util.Scanner;
public class PatternLoop {
    public static void main(String[] args){
        System.out.println("Welcome to Pyramid Pattern Generator ");
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number :");
        int num = input.nextInt();
       
        leftPattern(num);
        rightPattern(num);
        rightHalfPyramid(num);

    }
    public static void leftPattern(int num){
        System.out.println("Left Half partan");
        int i = 0;
        while(i< num){
            System.out.print("*");
            int y = 0;
            while(y<i) {
                System.out.print(" *");
                y++;
            }
            System.out.println();
            i++;

        }

        }
    public static void rightPattern(int num){
        System.out.println("down side parten");
        int i = num;
        while(i > 0){
            int y = 0;
            while(y < i){
                System.out.print("* ");
                y++;
            }
            i--;
            System.out.println();
        }

    }
    public static void rightHalfPyramid(int num){
        System.out.println(" right half piramint");
        int i = num;
        while (i > 0 ){

            int j = 0;
            while(j <= num-1){
                System.out.print(" ");
                j++;
            }
            int k = 0;
            while (k <= num- i){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i--;
        }
    }
}