package exam;

public class Task {
    String name;
    PriorityLevel priorityLevel;

    public Task(String name, PriorityLevel priorityLevel) {
        this.name = name;
        this.priorityLevel = priorityLevel;
    }

    public PriorityLevel getPriorityLevel() {
        return priorityLevel;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", PriorityLevel='" + priorityLevel + '\'' +
                '}';
    }



}
