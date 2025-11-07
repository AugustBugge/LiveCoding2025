class Demo{
    static void test(){
        //b
        Race race = new Race("København Grand Prix");
        
        //c
        GasolineCar Bumle = new GasolineCar();
        race.addCar(Bumle);
        race.accelerate();
        
        //d
        Car LynetMcQueen = new Car("Citroen Berlingo");
        Car Sally = new Car ("Citroen Berlingo");
    
        race.addCar(LynetMcQueen);
        race.addCar(Sally);
        
        //e
        race.accelerate();
        race.display();
        System.out.println(race.leading());
    }
}