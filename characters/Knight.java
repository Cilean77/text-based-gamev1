package characters;

public class Knight extends Character {
    
     public Knight(String name, int health, int attack){
        super(name, health, attack);
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
