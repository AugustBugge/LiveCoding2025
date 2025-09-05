import java.util.*;

public class TodoList {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        ArrayList<String> todoList = new ArrayList<String>();
        boolean isRunning = true;
        
        System.out.println("Welcome to your todo list");
        
        while (isRunning) {
            System.out.println("Input Command:");
            System.out.println("0: Exit 1: Print todo list 2: Add todo 3: Remove todo");
            
            int command = scan.nextInt();
            scan.nextLine();
            
            // Exit
            if (command == 0) {
                isRunning = false;
                continue;
                
                // Print
            } else if (command == 1) {
                if (todoList.isEmpty()) {
                    System.out.println("Your todo list is empty");
                } else {
                    for (int i = 0; i < todoList.size(); i++) {
                        String todoItem = todoList.get(i);
                        System.out.println(i + ": " + todoItem);
                    }
                }
                
                // Add Todo
            } else if (command == 2) {
                System.out.println("Input todo item");
                String todoItem = scan.nextLine();
                todoList.add(todoItem);
                
                // Remove Todo
            } else if (command == 3) {
                System.out.println("Input todo index");
                int todoIndex = scan.nextInt();
                scan.nextLine();
                todoList.remove(todoIndex);
            }
            
            System.out.println("");
        }
    }
}
