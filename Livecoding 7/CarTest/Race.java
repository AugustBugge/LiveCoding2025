import java.util.List;
import java.util.ArrayList;

class Race{
    String name;
    List<Car> cars;
    
    Race(String name){
        this.name = name;
        cars = new ArrayList<>();
    }
    
    void addCar(Car bleepbleepbloop){
        cars.add(bleepbleepbloop);
    }
    
    void accelerate(){
        for (Car c : cars){
            c.accelerate();
        }
    }
    
    void display(){
        System.out.println("Følgende biler deltager i '" + name + "':");
        for (Car c : cars){
            System.out.println("- " + c.toString());
        }
    }
    
    Car leading(){
        Car leading = cars.get(0);
        for (Car c : cars){
            if (c.getSpeed() > leading.getSpeed()){
                leading = c;
            }
        }
        return leading;
    }
}