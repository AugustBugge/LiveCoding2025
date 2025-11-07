import java.util.*;
class nodup{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HashSet<String> words = new HashSet<>();
        
        boolean duplicates = false;
        String line = scanner.nextLine();
        String[] individualWords = line.split(" ");
    
        for (String word : individualWords){
            /*if(words.contains(word)){
                duplicates = true;
            }*/
            words.add(word);
        }
        
        if (duplicates == true){
            System.out.println("no");
        } else{
            System.out.println("yes");
        }
    }
}