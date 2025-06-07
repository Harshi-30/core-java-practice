import java.util.Scanner;
class Search2Darray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to 2D Array search");
        int[][] numArray = ArrayUtility.input2Darray();
        System.out.print("Please enter the number you want to find :");
        int num = input.nextInt();
        boolean isFound = search(numArray, num);
        if(isFound){
            System.out.println("Your number was found");
        }else{
            System.out.println("Your number was not found ");
        }


    }
    public static boolean search(int[][]arr, int num){
        int i =0;//rows index
        while(i < arr.length){
            int j = 0;
            while(j < arr[i].length){    // arr[0] = {10, 20, 30} ⇒ arr[0].length = 3
                if(arr[i][j] == num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
    
}
