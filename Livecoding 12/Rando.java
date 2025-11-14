import java.util.*;
public class Rando {
    
    
    
    public static void main(String[] args) {
        Random r = new Random();
        List<String> list = new ArrayList<>();
        
        list.add("zero");
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        
        int chosenIndex = r.nextInt(list.size());
        System.out.println(list.get(chosenIndex));
        
        System.out.println(r.nextInt());
        System.out.println(r.nextInt(100));
        System.out.println(r.nextInt(10, 20));
    }
    
}