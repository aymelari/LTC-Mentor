package lesson20;

public class Role {
    String name;
    Integer minAge;
    Integer maxAge;

    public Role(String name, Integer minAge, Integer maxAge) {
        this.name = name;
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

    @Override
    public String toString() {
        return
                "role " + name
               ;
    }
}
