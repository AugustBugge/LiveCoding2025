import java.util.*;
public class Rando {
    
    
    
    public static void main(String[] args) {
        Random r = new Random();

        List<String> list = new ArrayList<>();
        
        list.add("zero");
        list.add("one");
        list.add("two");
        list.add("three")        
        int chosenIndex = r.nextInt(list.size());
        System.out.println(list.get(chosenIndex));
        

        System.out.println(r.nextInt());
        System.out.println(r.nextInt(100));
        
        int chosenIndex = r.nextInt(newlist.size());
        System.out.println(newlist.get(chosenIndex));
        

        System.out.println(r.nextInt(10, 20));
    }
    
}
