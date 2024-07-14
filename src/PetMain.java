public class PetMain {
    public static void main(String[] args) {
        VirtualPet pet1=new VirtualPet();
        pet1.setName("tom");
        pet1.setHappinessLevel(60);
        pet1.setHungerLevel(70);
        pet1.feed();
        pet1.play();
        pet1.printStats();

        VirtualPet pet2=new VirtualPet();
        pet1.setName("momo");
        pet1.setHappinessLevel(50);
        pet1.setHungerLevel(80);
        pet1.feed();
        pet1.play();
        pet1.printStats();



    }
}
