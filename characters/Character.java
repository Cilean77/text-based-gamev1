package characters;

public abstract class Character {

    private String name;
    public int health;
    int attack;
    public int experience;

    public Character(String name, int health, int attack, int experience){
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.experience = experience;
    }

    public abstract void displayInfo();
    public abstract void flee();

    public void attack(Character character){
        character.health -= attack;
    };

    public String getName(){
        return name;
    }


}
