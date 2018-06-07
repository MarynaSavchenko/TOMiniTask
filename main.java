package main;

import main.Devices.*;
import main.Games.*;


public class main {

    public static void main (String [] args){

        System.out.println("Hello! Let's start the example!");

        Totalizator totalizator = new Totalizator();
        

        Game footballGame = new FootballGame("Cracovia-Wisła");
        totalizator.addGame(footballGame);
        
        Device iosdevice = new iOSDevice("iphone");
        iosdevice.chooseGame(footballGame);
        iosdevice.registerToTotalizator(totalizator);
        
        Device windowsdevice = new WindowsDevice("windowsphone");
        windowsdevice.chooseGame(footballGame);
        windowsdevice.registerToTotalizator(totalizator);
        
        footballGame.updateScores("1:3");

        

        


    }

}
