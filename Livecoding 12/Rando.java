import java.util.*;
public class Rando {
    
    
    
    public static void main(String[] args) {
        Random r = new Random();
        List<String> newlist = new ArrayList<>();
        
        newlist.add("zero");
        newlist.add("one");
        System.out.println(r.nextInt());
        newlist.add("two");
        newlist.add("three");
        newlist.add("four");
        System.out.println(r.nextInt(100));
        
        int chosenIndex = r.nextInt(newlist.size());
        System.out.println(newlist.get(chosenIndex));
        

        System.out.println(r.nextInt(10, 20));
    }
    
}