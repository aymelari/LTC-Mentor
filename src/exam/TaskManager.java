package exam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TaskManager {
    List<Task> collection=new ArrayList<>() {
    };

    public TaskManager(List<Task> collection) {
        this.collection = collection;
    }

    public void Add(Task task){
         if(collection.contains(task)){
             throw new DuplicateTaskException("this task is already exists");
         }else{
                  collection.add(task);}
    }


    public void remove(String ad){
        for (Task task : collection){
            if(ad.equals(task.name)) {
            collection.remove(task);}
        }

    }

    public void display(){
        collection.forEach(task-> System.out.println(task));
    }

    public void displaySpecific(PriorityLevel level){
        for(Task task : collection){

//            if(level.equals(task.getPriorityLevel())){
//                System.out.println(task);
//            }

            if (task.getPriorityLevel() == level){
                System.out.println(task);
            }
        }
    }
}
