import java.util.Scanner;
class TriangleAreaCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Area of Triangle Calculator ");
      
        System.out.print("Enter breadth of triangle : ");
        Scanner input = new Scanner(System.in);
       
        float breadth = input.nextFloat();
        System.out.print("Enter height of triangle : " );
        float height = input.nextFloat();

        System.out.print("Area of Triangle is : "+((breadth*height)/2));
    }
}
