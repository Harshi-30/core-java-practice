class sumAndAverage2D {
    public static void main(String[] args) {
        System.out.println("Welcome to 2Darray");
        int[][] myarray = ArrayUtility.input2Darray();
        long sum = sumofArray(myarray);
        double average = avg(myarray);
        System.out.println("Sum of your array is " + sum);
        System.out.println("Average of your array is "+ average);

    }
    public static long sumofArray(int[][] arr){
        long sum = 0;
        int i = 0;
        while(i < arr.length){
            int j = 0;
            while(j < arr[i].length){
                sum += arr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static double avg(int[][] arr){
         if(arr.length == 0) return 0;
        
        int rows = arr.length;
        int column = arr[0].length;
        long sum = sumofArray(arr);
        double avg = (double)sum / (rows * column);
        return avg;
    }
}
