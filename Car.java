public class Car{
    String carDesc;
    double fuelCap;
    double fuel;
    double fuelConsum;
    double maxRange;
    int drivenKm;
    boolean isDriving;
    
    
    public Car(String carDesc, double fuelCap, double fuelConsum){
        this.carDesc = carDesc;
        this.fuelCap = fuelCap;
        this.fuelConsum = fuelConsum;
        this.maxRange = (fuel/fuelConsum) * 100;
        System.out.println("New Car: " + carDesc + ".");
    }
    
    public void drive(int distance, String name){
        int sessiondriven = 0;
        for(int i = 0; i < distance; i++){
            if(fuel < 0){
                System.out.println("Das Auto " + carDesc + " hat keinen Sprit mehr.");
                break;
            }
            fuel = fuel - fuelConsum/100;
            drivenKm = drivenKm + 1; 
            sessiondriven = distance;
            maxRange = (fuel/fuelConsum) * 100;
        }
        System.out.println("Das Auto " + carDesc + " fuhr in der Session " + name + " " + sessiondriven + "km.");
        System.out.println("Das Auto " + carDesc + " ist insgesamt " + drivenKm + " km gefahren.");
        System.out.println("Das Auto " + carDesc + " kann noch insgesamt " + (int) maxRange + " km fahren.");
    }
    
    public String toString(){
        String str = "Car: " + carDesc + "\n Fuel Cap: " + fuelCap + "\n Fuel Consum: " + fuelConsum + "\n Current Fuel: " + fuel + "\n Max.Range: " + maxRange + "\n Driven KM: " + drivenKm;
        return str;
    }
    
    public void refuelCar(){
        fuel = fuelCap;
        System.out.println("Das Auto " + carDesc + " wurde vollgetankt.");
        
    }
    
}