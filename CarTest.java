public class CarTest{
    public static void main(String[] args){
        Car golfv = new Car("Golf V TDI", 60, 6.2);
        golfv.refuelCar();
        System.out.println("Spritztour ins Allgäu bitte: 600km");
        golfv.drive(600, "ins Allgäu");
        System.out.println(golfv.toString());
        System.out.println("\nSo, und nun zurück. " + "Leider kein Geld mehr fürs Tanken...");
        golfv.drive(600, "zurück");
        System.out.println(golfv.toString());
    }
}