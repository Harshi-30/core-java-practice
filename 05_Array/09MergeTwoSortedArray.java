class MergeTwoSortedArray {
    public static void main(String[] args){
        int[] FirstArray = ArrayUtility.inputArray();
        int[] secondarray = ArrayUtility.inputArray();
        int[] mergeArray = merge(FirstArray, secondarray);
        ArrayUtility.Display(mergeArray);
    }
    public static int[] merge(int[]arrone , int[] arrTwo){
        int newSize = arrone.length + arrTwo.length;
        int[] newArray = new int[newSize];
        int i = 0, j = 0, k = 0;
        while(i < arrone.length || j < arrTwo.length){
            if(j == arrTwo.length|| i< arrone.length && (arrone[i] < arrTwo[j])){
                newArray[k] = arrone[i];
                i++;
                k++;
            }else{
                newArray[k] = arrTwo[j];
                j++;
                k++;
            }
        }
        return newArray;
    }
}
