import java.util.*;

public class Aquarium {
    
    //Felter: name, fishes
    //Konstruktører: Aquarium(name)
    //Metoder: addFish(…), growAll(), totalLength(), display()
    
    private String name;
    private List<Fish> fishes;
    
    Aquarium(String name) {
        this.name = name;
        fishes = new ArrayList<Fish>();
    }
    
    void addFish(Fish f) {
        fishes.add(f);
    }
    
    void growAll() {
        for (Fish fish : fishes) {
            fish.grow();
        }
    }
    
    double totalLength() {
        double sum = 0.0;
        for (Fish fish : fishes) {
            sum = sum + fish.getLength();
        }
        return sum;
    }
    
    void display() {
        //Akvariet 'ITqUarium' indeholder:
        //- Nemo er 3.7cm lang med 5 fisk i stimen
        //- Coral er 3.7cm lang
        //Fiskene er til sammen 22.2cm
        System.out.println("Akvariet '" + name + "' indeholder:");
        
        for (Fish fish : fishes) {
            System.out.println("- " + fish);
        }
        
        System.out.println("Fiskene er til sammen " + totalLength() + "cm");
    }
}