import java.util.List;
import java.util.ArrayList;

class Forest{
    private String name;
    private List<Tree> trees;
    
    Forest(String name){
        this.name = name;
        trees = new ArrayList<>();
    }
    
    void plant(Tree tree){
        trees.add(tree);
    }
    
    void grow(){
        for (Tree t : trees){
            t.grow();
        }
    }
    
    void display(){
        System.out.println(name + " indeholder:");
        for (Tree t : trees){
            System.out.println("- " + t.toString());
        }
    }
}