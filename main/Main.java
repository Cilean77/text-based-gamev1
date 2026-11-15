package main;
import characters.*;
import characters.Character;
import java.util.Scanner;

public class Main{
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    gameSelection();
    int select = scan.nextInt();

    switch(select){
        case 1: System.out.println("You have chosen the Noble Knight");
                Character Knight = new Knight(100, 40);
                break;
        case 2: System.out.println("You have chosen the White Mage");
                Character Mage = new Mage(90, 45);
                break;
        default: System.out.println("Not in Selection");
    }

    gameIntro();
    System.out.println("Something");
}

public static void gameSelection(){
    System.out.println(
        "-----Choose your Hero----- \n       [1] Knight \n       [2] Mage"
    );
}

public static void gameIntro(){
    System.out.println("""
                        \n         Welcome Hero! to The Path of texts \n
                        Where each decisions will lead to unknown destinations
                        And be warned for each choice will be your last...
                                       Goodluck Hero!""");

}


}