import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Create an ArrayList to store the to-do list items
        ArrayList<String> toDoList = new ArrayList<>();
        
        // Display the menu and continue until user chooses to exit
        boolean running = true;
        while (running) {
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. View items");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            
            switch (choice) {
                case 1:
                    // Add item to the to-do list
                    System.out.print("Enter the item to add: ");
                    String item = scanner.nextLine();
                    toDoList.add(item);
                    System.out.println("Item added: " + item);
                    break;
                    
                case 2:
                    // Remove an item from the to-do list
                    if (toDoList.isEmpty()) {
                        System.out.println("The to-do list is empty.");
                    } else {
                        System.out.println("To-Do List:");
                        for (int i = 0; i < toDoList.size(); i++) {
                            System.out.println((i + 1) + ". " + toDoList.get(i));
                        }
                        System.out.print("Enter the number of the item to remove: ");
                        int removeIndex = scanner.nextInt();
                        
                        if (removeIndex > 0 && removeIndex <= toDoList.size()) {
                            String removedItem = toDoList.remove(removeIndex - 1);
                            System.out.println("Removed: " + removedItem);
                        } else {
                            System.out.println("Invalid item number.");
                        }
                    }
                    break;
                    
                case 3:
                    // View all items in the to-do list
                    if (toDoList.isEmpty()) {
                        System.out.println("The to-do list is empty.");
                    } else {
                        System.out.println("To-Do List:");
                        for (int i = 0; i < toDoList.size(); i++) {
                            System.out.println((i + 1) + ". " + toDoList.get(i));
                        }
                    }
                    break;
                    
                case 4:
                    // Exit the program
                    running = false;
                    System.out.println("Exiting the program.");
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please choose between 1-4.");
                    break;
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
