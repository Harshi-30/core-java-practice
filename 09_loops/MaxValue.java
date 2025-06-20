import java.util.Scanner;
class MaxValue {
    public static void main(String[] args) {
        System.out.println("Welcome to array search");

        MaxValue maxNum = new MaxValue();
        int[] myArr = maxNum.getArray();

        int max = Integer.MIN_VALUE;
        for(int num:myArr ){
            if(max < num){
                max = num;
                
            }
            
        }
        System.out.println("Maximum value is: "+max);
    }
       
    
        public static int[] getArray(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter size of array");
            int size = input.nextInt();
            int[] myArr = new int[size];

            int i=0;
            while(i < size){
                System.out.print("Enter the element "+(i+1)+ " : ");
                myArr[i]=input.nextInt();
            i++;
            }
            System.out.println();
            return myArr;

    }
    
}
