package characters;

public class Knight extends Character {
    
     public Knight(String name, int health, int attack, int experience){
        super(name, health, attack, experience);
    }

    @Override
    public void displayInfo(){
        System.out.println(getName() + "\nHP: %d \nAttack: %d".formatted(health, attack));
    }

    @Override  
    public void flee(){
        System.out.println("You have fled...");
    }

}
