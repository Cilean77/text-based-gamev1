package main;
import characters.*;
import characters.Character;
import java.util.Scanner;
import story.*;

public class Main{
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Character goblin = new Goblin("goblin", 45, 20, 10);  //goblin enemy obj
    
    
    Character player = charSelection(scan);  //main player obj stored
    gameIntro(player.getName());
    gameLoopOne(scan, player, goblin);

}
/* */
/* */
/* */
/* */
/* */
/* */
//Outside Main methods
public static Character charSelection(Scanner scan){    //selection
    
    System.out.println( "-----Choose your Hero----- \n       [1] Knight \n       [2] Mage");
    int select = scan.nextInt();    //User input Selection
    scan.nextLine();  //buffer fix
    Character hero = null;
    System.out.println("Enter player name: ");
    String name = scan.nextLine();  //User input Player name

    switch(select){
        case 1: System.out.println("You have chosen the Noble Knight");
                hero = new Knight(name, 100, 40, 0);
                break;
        case 2: System.out.println("You have chosen the White Mage");
                hero = new Mage(name, 90, 45, 0);
                break;
        default: System.out.println("Not in Selection");
    }
    return hero;
}

public static void gameIntro(String playerName){    //intro
    System.out.println("""
        \n\n----------------------------------------------------------
                    Welcome Hero %s! to The Path of Texts \n
            Where each decisions will lead to unknown destinations
            And be warned for each choice will be your last...
                            Goodluck Hero!\n
        ----------------------------------------------------------\n\n""".formatted(playerName));

}

public static void gameLoopOne(Scanner scan, Character hero, Character goblin){
    MainStory story = new MainStory();
    
    story.castleGateOut();                 //scene1
    String choice = null;
        while(true){
            choice = scan.nextLine();
            if(choice.equalsIgnoreCase("A")){
                story.roadLeft();
                break;
            }else if(choice.equalsIgnoreCase("B")){
                story.roadRight();
                break;
            }else{
                System.out.print("Choose a path--");
    }
}
 
    story.goblinEncounter();              //scene 2
            while(true){ 
            choice = scan.nextLine();
            if(choice.equalsIgnoreCase("A")){
                hero.attack(goblin);
                goblin.displayInfo();
                goblin.attack(hero);
                hero.displayInfo();
                    if(goblin.health <= 0){
                        story.enemySlain();
                        hero.experience++;
                        break;
                    }
            }else if(choice.equalsIgnoreCase("F")){
                hero.flee();
                break;
            }else{
                System.out.print("Would you attack or flee--");
        } 
    }

    System.out.println("XP Level: " + hero.experience);
}
}

