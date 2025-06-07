class CheckPost {
    public static void main(String[] args) {
        int[] myArray = ArrayUtility.inputArray();
        boolean isIncreasing = isIncreasing(myArray);
        boolean isDecreasing = isDecreasing(myArray);
        if(isIncreasing || isDecreasing){
            System.out.println("Your array is Sorted.");
        }else{
            System.out.println("Your array is not Sorted. ");
        }
    }
    public static boolean isIncreasing(int[]arr){
        if(arr.length <= 1) return true;

        int i = 1 ;
        while(i < arr.length){
            if (arr[i] < arr[i-1]) {
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isDecreasing(int[]arr){
        int i = 1;
        while(i < arr.length){
            if(arr[i] > arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    
}
