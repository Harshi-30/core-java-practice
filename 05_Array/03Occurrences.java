import java.util.Scanner;
class Occurrences {
    public static void main(String[] args){
        int[] myArray = ArrayUtility.inputArray();
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number to search : ");
        int num = input.nextInt();
        int occurrences = countOccurrences(myArray, num);
        System.out.println("Your number is found " + occurrences + " times in the list. ");
    }
    public static int countOccurrences(int[]arr , int num){
        int count = 0;
        int i = 0;
        while(i < arr.length){
            if(arr[i] == num){
                count++;
            }
            i++;
        }
        return count;
    }
}
