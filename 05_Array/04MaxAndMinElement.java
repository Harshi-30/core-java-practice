class MaxAndMinElement {
    public static void main(String[] args) {
        int[] myArray = ArrayUtility.inputArray();

        int maxValue = maxnum(myArray);
        System.out.println("Maximum value in list is " + maxValue);

        int minValue = minnum(myArray);
        System.out.println("Minimum value in list is :" + minValue);

    }
    public static int maxnum(int[]arr){

        if(arr.length == 0){
        return Integer.MIN_VALUE;
        }
        int max = arr[0];
        int i = 1;
        while(i < arr.length){
        if(max < arr[i]){
            max = arr[i];
        }
        i++;
    }
        return max;
    }
    public static int minnum(int[]arr){
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }
        
        int min = Integer.MAX_VALUE;
        int i= 0;
        while(i < arr.length){
            if(min > arr[i]){
                min = arr[i];
            }
            i++;
        }
        
        return min;
    }
}
