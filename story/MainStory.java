package story;

public class MainStory implements Rooms,Routes{
    
    @Override
    public void castleGateOut(){
        System.out.println("""
            You stand outisde the castle's gate. As you follow the road ahead
            you stumble on 2 paths. Which path do you choose? [A]Left [B]Right""");
    }
    @Override
     public void roadLeft(){
        System.out.println("""
            You have chosen the left path.""");
    }
    @Override
     public void roadRight(){
        System.out.println("""
            You have chosen the right path.""");
    }
    @Override
    public void movingOn(){
        System.out.println("As you kept waling a long a path ");
    }

    //Encounters
    @Override
    public void goblinEncounter(){
        System.out.println("""
          \nAs you follow along the road You have encountered a goblin, prepare!
                        Would you attack or flee? [A] [F]""");
    }

    //Rooms
    @Override
    public void mysteriousDoor(){
        System.out.println("You find a mysterious door");
    }
    @Override
    public void cell(){
        System.out.println("You find a jail cell");
    }

}
