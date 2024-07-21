package exam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Task> collection=new ArrayList<>() {
        };
        TaskManager taskManager=new TaskManager(collection);
        Task task1 =new Task("bio",PriorityLevel.HIGH);
        Task task2 =new Task("math",PriorityLevel.LOW);
        Task task3 =new Task("chem",PriorityLevel.MEDIUM);

       taskManager.Add(task1);
        taskManager.Add(task2);
        taskManager.Add(task3);
        taskManager.display();
        System.out.println(" --------");

        taskManager.remove("math");
        taskManager.display();


        System.out.println(" ----***************----");
        taskManager.displaySpecific(PriorityLevel.MEDIUM);

    }
}
