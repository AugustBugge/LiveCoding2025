public class SchoolFish extends Fish {
    //Felter: …, count
    //Konstruktører: SchoolOfFish(…, count)
    //Metoder: grow(), getLength(), toString()
    
    int count;
    
    SchoolFish(String name, int count) {
        super(name);
        this.count = count;
    }
    
    @Override
    void grow() {
        super.grow();
        //count = count - 1;
        //count -= 1;
        count--;
    }
    
    @Override
    double getLength() {
        //return length * count;
        return super.getLength() * count;
    }
    
    @Override
    public String toString() {
        return super.toString() + " med " + count + " fisk i stimen";
    }
}