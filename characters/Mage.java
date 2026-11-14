package characters;

public class Mage extends Character{
    
     public Mage(int health, int attack){
        super(health, attack);
    }

    @Override
    public void displayInfo(){
        System.out.println("Mage \n Health: %d \n Attack: %d".formatted(health, attack));
    }
}
