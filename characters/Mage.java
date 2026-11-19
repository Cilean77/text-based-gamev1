package characters;

public class Mage extends Character{
    
     public Mage(String name, int health, int attack,int experience){
        super(name, health, attack, experience);
    }

    public void castSpell(){
        System.out.println("Casted Spell!");
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
    }
    
    @Override  
    public void flee(){
        System.out.println("You have fled...");
    }
}
