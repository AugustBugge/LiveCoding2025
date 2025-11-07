class Car{
    protected String model;
    protected double speed;
    
    Car(String model){
        this.model = model;
    }
    
    void accelerate(){
        speed = speed + 4.5;
        //speed += 4.5
    }
    
    double getSpeed(){
        return speed;
    }
    
    public String toString(){
        return "En " + model + " der kører " + speed + " km/t";
    }
    
}