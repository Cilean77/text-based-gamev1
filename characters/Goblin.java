package characters;

public class Goblin extends Character{
    
    public Goblin( String name,int health, int attack){
        super(name, health, attack);
    }

    @Override
    public void displayInfo(){
        System.out.println("Goblin \nHP: %d \nAttack: %d".formatted(health, attack));
    }

    @Override  
    public void flee(){

    }
}
