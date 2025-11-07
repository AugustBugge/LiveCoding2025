class GasolineCar extends Car{
    int tank;
    
    GasolineCar(){
        super("Gasoline Car");
        tank = 10;
    }
    
    @Override
    void accelerate(){
        super.accelerate();
        tank--;
        //tank = tank-1
    }
    
    @Override
    public String toString(){
        return super.toString() + " med " + tank + " L tilbage";
    }
    
    
}