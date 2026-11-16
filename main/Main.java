package main;
import characters.*;
import characters.Character;
import java.util.Scanner;
import story.*;

public class Main{
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    charSelection(scan);
    gameIntro();
    gameLoopOne(scan);

}
/* */
/* */
/* */
/* */
/* */
/* */
//Outside Main methods
public static void charSelection(Scanner scan){
    
    System.out.println( "-----Choose your Hero----- \n       [1] Knight \n       [2] Mage");
    int select = scan.nextInt();    //User input Selection

    switch(select){
        case 1: System.out.println("You have chosen the Noble Knight");
                Character Knight = new Knight(100, 40);
                break;
        case 2: System.out.println("You have chosen the White Mage");
                Character Mage = new Mage(90, 45);
                break;
        default: System.out.println("Not in Selection");
    }
    scan.nextLine();
}

public static void gameIntro(){
    System.out.println("""
        \n\n----------------------------------------------------------
                    Welcome Hero! to The Path of Texts \n
            Where each decisions will lead to unknown destinations
            And be warned for each choice will be your last...
                            Goodluck Hero!\n
        ----------------------------------------------------------\n\n""");

}

public static void gameLoopOne(Scanner scan){
    MainStory story = new MainStory();
    
    story.castleGateOut();
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
 
    story.goblinEncounter();              //UPDATE this storyline
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
}
