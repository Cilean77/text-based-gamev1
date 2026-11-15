package characters;

public class Goblin extends Character{
    
    public Goblin(int health, int attack){
        super(health, attack);
    }

    @Override
    public void displayInfo(){
        System.out.println("Goblin \n HP: %d \n Attack: %d".formatted(health, attack));
    }

    @Override  
    public void flee(){

    }
}
