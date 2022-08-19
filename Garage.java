class Garage{
    Car meinErstesAuto;
    Car dasErsatzAuto;
    
    Garage(){
        meinErstesAuto = new Car("McLaren P1", 120, 5.6);
        dasErsatzAuto = new Car("Volkswagen Golf", 30, 3.4);
        meinErstesAuto.refuelCar();
        dasErsatzAuto.refuelCar();
        gibInfos(meinErstesAuto);
    }
    
    

    void alleFahrenEinRennen(){
        meinErstesAuto.drive(100, "Rennen 1");
        dasErsatzAuto.drive(100, "Rennen 1");
        meinErstesAuto.refuelCar();
        dasErsatzAuto.refuelCar();
    }
    void gibInfos(Car car){
        System.out.println(car.toString());
    }
    
    
    
    
    
    
}