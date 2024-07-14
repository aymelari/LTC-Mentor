public class VirtualPet {
   private String name;
    private int  hungerLevel;
    private int happinessLevel;

    public int getHungerLevel() {
        return hungerLevel;
    }

    public String getName() {
        return name;

    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

public void feed(){
        hungerLevel+=10;
        happinessLevel-=5;

}

public  void play(){
        hungerLevel+=5;
        happinessLevel-=10;
    }

    public void printStats(){
        System.out.println("name: " + getName());
        System.out.println("hapiness level "+getHappinessLevel());
        System.out.println("hunger level "+getHungerLevel());

    }

}
