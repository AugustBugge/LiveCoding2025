public class Fish {
    //Felter: name, length
    //Konstruktører: Fish(name)
    //Metoder: getLength(), grow(), toString()
    String name;
    double length;
    
    Fish(String name) {
        this.name = name;
        length = 2.5;
    }
    
    double getLength() {
        return length;
    }
    
    void grow() {
        //length = length + 1.2;
        length += 1.2;
    }
    
    @Override
    public String toString() {
        return name + " er " + length + "cm lang";
    }
}