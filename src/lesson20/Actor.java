package lesson20;

public class Actor {
    String name;
    Integer age;
    Integer actingSkill;

    public Actor(String name, Integer age, Integer actingSkill) {
        this.name = name;
        this.age = age;
        this.actingSkill = actingSkill;
    }

    @Override
    public String toString() {
        return "Actor "  + name;
    }
}
