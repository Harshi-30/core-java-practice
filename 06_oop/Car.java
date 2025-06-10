public class Car {
    static int noOfCarSold;
    int noOfWheels; // instance veriable
    String color;
    float maxSpeed;
    float currentFuleInLiter;
    int noOfSeat;
    static{
        noOfCarSold = 0;//one time when class lode 
        System.out.println("\ni Am in Static block");
    }
    {
        noOfCarSold++; // every time object bante he call hota 
        System.out.println("I am in Init block");
    }
    Car(String color){
        noOfWheels = 4;
        this.color = color;
        maxSpeed = 120;
        currentFuleInLiter = 2;
        noOfSeat = 5;

    }
    Car(){
        this("Black");
        currentFuleInLiter = 5;
    }

    public Car start(){
        if(currentFuleInLiter == 0){
            System.out.println("\nCar is out of fuel,can't be started");
        }else if(currentFuleInLiter <= 3){
            System.out.println("Your car is in reserve mode, please refuel ");
            
        }else{
             System.out.println("\nCar is started. ");
              
            }
        return this;
    }
    public void drive(){  //instance method
        currentFuleInLiter --;
             System.out.println("Car is driving. ");
    }

    public void addFuel(float fule){
        this.currentFuleInLiter+= fule;
    }
    public float getcurrentFuleInLiter(){
        return currentFuleInLiter;
    }
}
