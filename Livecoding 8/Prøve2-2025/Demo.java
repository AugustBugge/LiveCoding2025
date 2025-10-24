public class Demo {
    static void test() {
        Aquarium aquarium = new Aquarium("ITqUarium");
        
        SchoolFish sf = new SchoolFish("Nemo", 5);
        aquarium.addFish(sf);
        aquarium.growAll();
        
        Fish f = new Fish("Coral");
        aquarium.addFish(f);
        aquarium.growAll();
        
        aquarium.display();
    }
}