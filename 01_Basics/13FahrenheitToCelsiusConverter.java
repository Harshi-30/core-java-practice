import java.util.Scanner;
class FahrenheitToCelsiusConverter {
    public static void main(String[] args){
        System.out.println(" Welcome to Celsius Calculator");
        System.out.println("Enter Temperature in fahrenheit :");
        Scanner input =  new Scanner(System.in);
        float fahrenheit = input.nextFloat();
        System.out.println("Temperature is : " + ((fahrenheit-32)*5/9 ) + "C");
    }
}
