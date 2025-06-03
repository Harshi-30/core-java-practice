import java.util.Scanner;
class RectanglePerimeterCalculator {
    public static void main(String[] args){
        System.out.println("Welcome to rectangle Perimeter calculator");
        System.out.print("Please enter length of Rectangle : ");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        System.out.print("Please enter breadth of Rectangle : ");
        int breadth = input.nextInt();
        System.out.println("Perimeter of Rectangle is : " + (2*(length + breadth)));
    }
}
