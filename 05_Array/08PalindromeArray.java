class PalindromeArray {
    public static void main(String[] args) {
        int []myArray = ArrayUtility.inputArray(); 
        boolean isPalindrome = isPalindrome(myArray);
        if(isPalindrome){
            System.out.println("Your array is palindrome");
        }else{
            System.out.println("Your array is not palindrome");
        }
    }
    public static boolean isPalindrome(int[]arr){
        int i = 0;
        while(i < arr.length/2){
            if(arr[i] != arr[(arr.length - 1) - i]){
                return false;

            }
            i++;
        }
        return true;
    }
}
