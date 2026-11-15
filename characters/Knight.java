package characters;

public class Knight extends Character {
    
     public Knight(int health, int attack){
        super(health, attack);
    }

    @Override
    public void displayInfo(){
        System.out.println("Knight \n HP: %d \n Attack: %d".formatted(health, attack));
    }

    @Override  
    public void flee(){

    }

}
