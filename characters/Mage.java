package characters;

public class Mage extends Character{
    
     public Mage(int health, int attack){
        super(health, attack);
    }

    public void castSpell(){
        System.out.println("Casted Spell!");
    }

    @Override
    public void displayInfo(){
        System.out.println("Mage \n HP: %d \n Attack: %d".formatted(health, attack));
    }
    
    @Override  
    public void flee(){

    }
}
