package characters;

public abstract class Character {
    int health;
    int attack;

    public Character(int health, int attack){
        this.health = health;
        this.attack = attack;
    }

    public void displayInfo(){
        System.out.println("HP: %d \n Attack: %d".formatted(health, attack));
    }

    public void attack(Character character){
        character.health -= attack;
        System.out.println("HP: " + health);
    };
    public abstract void flee();

}
