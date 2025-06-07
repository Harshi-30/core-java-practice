class SumOfDiagonal {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum Of Diagonal Element");
        int[][] myArray = ArrayUtility.input2Darray();
        long digonalSum = diagonalSum(myArray);
        System.out.println("Your sum of Digonal is" + digonalSum);

    }
    public static long diagonalSum(int[][] arr){
    long rightDiagonalSum = rightDiagonalSum(arr);
    long leftDiagonalSum =  leftDiagonalSum(arr);
    long sum = rightDiagonalSum + leftDiagonalSum;
    if(arr.length % 2 != 0){
        int index = arr.length /2;
        sum -= arr[index][index];
    }


        return sum;
    }
    public static long rightDiagonalSum(int[][] arr){
    long sum = 0;
    int i = 0;
    while(i < arr.length){
        int col = (arr.length - 1)-i;
        sum += arr[i][col];
        i++;
    }

        return sum;
    }
    public static long leftDiagonalSum(int[][] arr){
        long sum = 0;
        int i = 0;
        while(i < arr.length){
            sum += arr[i][i];
            i++;
        }
        return sum;
    }
}
