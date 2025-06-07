import java.util.Scanner;
class DeletingElement {
    public static void main(String[] ars){
        System.out.println("Welcome to creating new array");
       int[] myArray = ArrayUtility.inputArray();
       Scanner input = new Scanner(System.in);
       System.out.print("Please enter the element want to delete : ");
       int num = input.nextInt();
       int[] newArray = deleteElement(myArray, num);
       ArrayUtility.Display(newArray);
    }
    public static int[]deleteElement(int[]arr ,int num){
        int occurrences = Occurrences.countOccurrences(arr, num);

        int newSize = arr.length - occurrences;

        int[] newArray = new int[newSize];
        int i = 0 ,j = 0;
        while(i < arr.length){
            if(arr[i] != num){
                newArray[j] = arr[i];
                j++;
            }
            i++;
        }

        return newArray;
    }
}
