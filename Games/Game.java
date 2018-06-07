package main.Games;

import main.Totalizator;

public abstract class Game {
	
	protected String scores;
	protected String name;
	protected Totalizator totalizator;
	protected Types type;
	
	public String getName(){
        return name;
    }

    public String getScores(){
        return scores;
    }

    public void updateScores(String scores){
        this.scores = scores;
        totalizator.notifyDevices(this);
        
    }
    
    public void setTotalizator(Totalizator totalizator) {
    	this.totalizator=totalizator;
    }


    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public abstract boolean equals(Object obj) ;



}
