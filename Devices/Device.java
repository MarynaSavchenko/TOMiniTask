package main.Devices;

import main.Totalizator;
import main.Games.Game;

public abstract class Device {
	
	protected String type;
	protected  String name;
	protected Game game;
	
	public void chooseGame(Game game){
        this.game = game;
    }

    public void registerToTotalizator(Totalizator totalizator){

       totalizator.addDevice(this, game);
    }

<<<<<<< HEAD
    public void unregisterFromTotalizator(Totalizator totalizator){

        totalizator.removeDevice(this, game);
    }

    public void update(Game game){

       System.out.println(type+" "+name+" updated: Game: "+game.getName()+" new scores: " + game.getScores() + "\n");
=======
    public void update(Game game){

       System.out.println(type+" "+name+" updated: Game: "+game.getName()+" new scores: " + game.getScores());
>>>>>>> 493dacd087cf3abf555620ab9f4531d42bd64d67
    }




    // ------- ADDITIONAL FUNCTIONS

    @Override
    public int hashCode() {
        return (type+name).hashCode();
    }

    public abstract boolean equals(Object object);
}
