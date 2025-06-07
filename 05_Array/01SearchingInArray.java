import java.util.Scanner;
class SearchingInArray {
    public static void main ( String[] args){
        System.out.println("Welcome to Array Searching" );
        int [] myArray = {23,45,67,89,32,54,76,98,};
        Scanner input = new Scanner(System.in);     
        
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        
        boolean isFound = search(myArray,num);
        if (isFound){
            System.out.println("Your number is found");
        }else{
            System.out.println("Your number is not found");
        }

    }
    public static boolean search(int[]arr ,int num){
        int index = 0 ;
        while (index < arr.length){
            if (arr[index] == num){
                return true;
            }
            index++;
        }
        return false;
    }
}
