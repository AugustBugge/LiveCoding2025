class FruitTree extends Tree{
    protected int fruits;
    
    FruitTree(String type){
        super(type);
        fruits = 0;
    }
    
    @Override
    void grow(){
        super.grow();
        
        if(fruits == 0){
            fruits = 1;
        } else{
            fruits = fruits * 2;
        }
    }
    
    @Override
    public String toString(){
        return super.toString() + " med " + fruits + " frugt(er)";
    }
}