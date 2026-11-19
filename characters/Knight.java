package characters;

public class Knight extends Character {
    
     public Knight(String name, int health, int attack, int experience){
        super(name, health, attack, experience);
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
