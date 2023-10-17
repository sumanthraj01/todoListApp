import java.util.ArrayList;
import java.util.Scanner;
public class TodoListApp 
    {
        private ArrayList<String> todoList = new ArrayList<>();
        public void displayList() 
        {
            if(todoList.size()==0)
            {
                System.out.println("The list is empty");
            }
            else
            {
                System.out.println("To-Do List:");
                for (int i = 0; i < todoList.size(); i++) 
                {
                    System.out.println((i + 1) + ". " + todoList.get(i));
                }
            }
        }
        public void addTask(String task) 
        {
            todoList.add(task);
            System.out.println("Task added: " + task);
        }
        public void removeTask(int taskIndex) 
        {
            if (taskIndex >= 0 && taskIndex < todoList.size()) 
            {
                String removedTask = todoList.remove(taskIndex);
                System.out.println("Task removed: " + removedTask);
            } 
            else 
            {
                System.out.println("Invalid task index.");
            }
    }
    public static void main(String[] args) 
    {
        TodoListApp todoApp = new TodoListApp();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do 
        {
            System.out.println("\nMenu:");
            System.out.println("1. Display To-Do List");
            System.out.println("2. Add Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) 
            {
                case 1:
                    todoApp.displayList();
                    break;
                case 2:
                    System.out.print("Enter the task to add: ");
                    String taskToAdd = scanner.nextLine();
                    todoApp.addTask(taskToAdd);
                    break;
                case 3:
                    System.out.print("Enter the task index to remove: ");
                    int taskIndex = scanner.nextInt();
                    scanner.nextLine();  
                    todoApp.removeTask(taskIndex - 1); 
                    break;
                case 4:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid choice, Please try again.");
            }
        } while (choice != 4);
        scanner.close();
    }
}