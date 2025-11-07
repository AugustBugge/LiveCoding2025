import java.util.*;
class aterriblefortress{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int blazes = 0;
        int n = scanner.nextInt();
        
        for(int i = 0; i < n; i++){
            int a = scanner.nextInt();
            blazes = blazes + a;
        }
        
        System.out.println(blazes);
    }
}