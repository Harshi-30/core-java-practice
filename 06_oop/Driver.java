public class Driver {
    static int minmuAgeForDrining = 18;
    String name;
    String dateOfLicence;
    int age;
    public boolean isAllowedToDrive(){
        return this.age >=minmuAgeForDrining;
    }
    public static void main(String[] args) {
        // Car maruti = new Car(); //new = object creation
        // maruti.addFuel(3);
        // maruti.drive();
       // System.out.println(maruti.getcurrentFuleInLiter());
        Car Thar = new Car();
        Thar.start().drive() ;
        Thar.addFuel(5f);
        System.out.println(Thar.color);
        System.out.println(Thar.getcurrentFuleInLiter());
        Car swift = new Car("Red");
       System.out.println();
 // swift.addFuel(4);
        swift.start().drive();
        swift.addFuel(2f);
        System.out.println(swift.color);
        System.out.println(swift.getcurrentFuleInLiter());
        // Driver myDriver = new Driver();
        // System.out.println(Driver.minmuAgeForDrining);
        
    }
}
