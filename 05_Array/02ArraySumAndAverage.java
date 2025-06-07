import java.util.Scanner;
class ArraySumAndAverage {
    public static void main(String[] args){
        System.out.println(" Welcome to  Array  Sum And Average");
        int []myArray = getArray();
        int total = sumOfArray(myArray);
        System.out.println("Sum of Array is :" + total);
        double average = average(myArray);
        System.out.println("Average of the Array is :" + average);
    }
    public static int[] getArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter size of list : ");
        int size = input.nextInt();
        int []myArr = new int[size];
        int i = 0;
        while(i < size){
            System.out.print("Please enter element" + (i+1)+ ":");
            myArr[i] = input.nextInt();
            i++;
        }
        return myArr;
    }
    public static int sumOfArray(int[]arr){
       int index =0;
       int sum = 0;
       while(index <arr.length){
           sum += arr[index];

           index++;
       }
        return sum;
    }
    public static double average(int[]arr){
        double sum = sumOfArray(arr);
        sum/=arr.length;
        return sum;
    }
}
