public class Car{
    String carDesc;
    double fuelCap;
    double fuel;
    double fuelConsum;
    double maxRange;
    int drivenKm;
    boolean isDriving;
    
    
    public Car(String carDesc, double fuelCap, double fuelConsum, double maxRange){
        this.carDesc = carDesc;
        this.fuelCap = fuelCap;
        this.fuelConsum = fuelConsum;
        this.maxRange = maxRange;
        System.out.println("New Car: " + carDesc + ".");
    }
    
    public void drive(int distance){
        int sessiondriven = 0;
        for(int i = 0; i < distance; i++){
            if(drivenKm == maxRange){
                System.out.println("Das Auto " + carDesc + " hat seine maximale Reichweite erreicht.");
                break;
            }
            if(fuel < 0){
                System.out.println("Das Auto " + carDesc + " hat keinen Sprit mehr.");
                break;
            }
            fuel = fuel - fuelConsum/100;
            drivenKm = drivenKm + 1; 
            sessiondriven = distance;
        }
        System.out.println("Das Auto " + carDesc + " fuhr in dieser Session " + sessiondriven + "km."); 
    }
    
    public String toString(){
        return carDesc;
    }
    
    public void refuelCar(){
        fuel = fuelCap;
        System.out.println("Das Auto: " + carDesc + " wurde vollgetankt.");
        
    }
    
}