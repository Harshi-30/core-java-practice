import java.util.Scanner;
class UserInputDemo{
    public static void main(String[] args){
       Scanner src = new Scanner(System.in);
     
       System.out.print("please enter your name : ");
        String name = src.nextLine();
      
        System.out.println(" Good morning " + name );//string concetination
      
        System.out.print(name + " Also enter your age :");
       
        int age = src.nextInt();
        System.out.println(name + " Your age is : " + age);
    }
}