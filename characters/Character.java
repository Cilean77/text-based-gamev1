package characters;

public class Character {
    int health;
    int attack;

    public Character(int health, int attack){
        this.health = health;
        this.attack = attack;
    }

    public void displayInfo(){
        System.out.println("Health: %d \n Attack: %d".formatted(health, attack));
    }
}
