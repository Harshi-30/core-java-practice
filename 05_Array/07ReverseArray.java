class ReverseArray {
    public static void main(String[] args) {
    int[] myArray = ArrayUtility.inputArray();
    reverse(myArray);
    ArrayUtility.Display(myArray);
   // System.out.println(ArrayUtility.Display(reverse(myArray)));
    }
    public static void reverse(int[] arr){
       int i = 0;
       while(i < arr.length/2){
        int swap = arr[i];
        arr[i] = arr[(arr.length -1)-i];
        arr[(arr.length-1)-i] = swap;
        i++;
       }
        
    }
}
