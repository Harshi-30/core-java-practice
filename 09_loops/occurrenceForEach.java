import java.util.Scanner;
class occurrenceForEach {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] myArr = MaxValue.getArray();
        System.out.print("Enter the number you search for: ");
        int num = input.nextInt();
        

        int count = 0;
        for(int number : myArr){
            if(number == num){
                count++;
            }
        }
        System.out.println("\nYour number occurre "+ count +" times in array");
    }
}
