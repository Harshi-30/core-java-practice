import java.util.Scanner;

class ArrayUtility {

    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter size of list : ");
        int size = input.nextInt();
        int []myArr = new int[size];
        int i = 0;
        while(i < size) {
            System.out.print("Please enter the number of elements " + (i + 1) + ":");
            myArr[i] = input.nextInt();
            i++;
        }
        return myArr;
    }

    public static void Display(int[]arr){
        int i = 0;
        while(i < arr.length){
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }
    public static int[][] input2Darray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Number of Rows :");
        int rows = input.nextInt();
        System.out.print("Please enter Number of Columns :");
        int columns = input.nextInt();
      
        if (rows <= 0 || columns <= 0) {
            System.out.println("Rows and columns must be positive.");
            return null;
        }
        
        int [][]numArray = new int[rows][columns];
        int i = 0;
        while(i < rows){
            int j = 0;
            while(j < columns){
                System.out.print("Please enter elements of rows : " + (i + 1) + "columns "+ (j+1)+" :  ");
            numArray[i][j] = input.nextInt();
            j++;    
            }
            i++;
        }
        return numArray;

    }
}
