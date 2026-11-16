package characters;

public class Mage extends Character{
    
     public Mage(String name, int health, int attack){
        super(name, health, attack);
    }

    public void castSpell(){
        System.out.println("Casted Spell!");
    }

    @Override
    public void displayInfo(){
        System.out.println(getName() + "\n HP: %d \n Attack: %d".formatted(health, attack));
    }
    
    @Override  
    public void flee(){
        System.out.println("You have fled...");
    }
}
