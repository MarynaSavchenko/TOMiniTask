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
<<<<<<< HEAD

        if(totalizator != null) {
            totalizator.updateScoreNotification(this);
        }else{
            System.out.println("You are not in any totalizator subscription");
        }
    }


=======
        totalizator.notifyDevices(this);
        
    }
    
>>>>>>> 493dacd087cf3abf555620ab9f4531d42bd64d67
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
