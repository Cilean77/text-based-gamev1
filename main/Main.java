package main;
import characters.*;
import characters.Character;
import java.util.Scanner;

public class Main{
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    gameSelection();
    int choice = scan.nextInt();

    switch(choice){
        case 1: System.out.println("You have chosen the Knight");
                break;
        case 2: System.out.println("You have chosen the Mage");
                break;
        default: System.out.println("Not in Selection");
    }
}

public static void gameSelection(){
    String charSelection = String.format(
        "-----Choose your Hero----- \n[1] Knight \n[2] Mage"
    );
    System.out.println(charSelection);
}
}