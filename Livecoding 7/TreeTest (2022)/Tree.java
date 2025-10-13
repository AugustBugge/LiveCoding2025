class Tree{
    protected String type;
    protected double height;
    
    Tree(String type){
        this.type = type;
        height = 0.0;
    }
    
    void grow(){
        height += 0.5;
    }
    
    double getHeight(){
        return height;
    }
    
    public String toString(){
        return "Et " + height + "m højt " + type + "træ";
    }
}