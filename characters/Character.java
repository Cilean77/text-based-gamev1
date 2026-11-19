package characters;
import java.util.Random;

public abstract class Character {
    Random rand = new Random();

    private String name;
    public int health;
    public int attack;
    public int experience;

    public Character(String name, int health, int attack, int experience){
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.experience = experience;
    }

    public void displayInfo(){
        System.out.println(getName() + "\nHP: %d \nAttack: %d".formatted(health, attack));
    }
    public abstract void flee();

    public void attack(Character character){
        int randAttck = rand.nextInt(attack);
        character.health -= randAttck;
    }

    public String getName(){
        return name;
    }


}
