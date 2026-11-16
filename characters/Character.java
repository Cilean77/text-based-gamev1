package characters;

public abstract class Character {
    private String name;
    int health;
    int attack;

    public Character(String name, int health, int attack){
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    public abstract void displayInfo();
    public abstract void flee();

    public void attack(Character character){
        character.health -= attack;
        System.out.println("HP: " + health);
    };

    public String getName(){
        return name;
    }


}
