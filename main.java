package main;

import main.Devices.*;
import main.Games.*;


public class main {

    public static void main (String [] args){

<<<<<<< HEAD
        System.out.println("Hello! Let's start the example!\n");

        Totalizator totalizator = new Totalizator();
        
        //LET'S CREATE NEW GAMES AND ADD THEM TO TOTALIZATOR
        Game footballGame = new FootballGame("Cracovia-Wisła");
        totalizator.addGame(footballGame);

        Game volleyballGame = new VolleyballGame("Golden State Warriors - Cleveland Cavaliers");
        totalizator.addGame(volleyballGame);

        Game volleyballGame2 = new VolleyballGame("Wikings- Cowboys");

        //LET'S CREATE DEVICES, CHOSE GAME AND REGISTER TO TORALIZATOR
=======
        System.out.println("Hello! Let's start the example!");

        Totalizator totalizator = new Totalizator();
        

        Game footballGame = new FootballGame("Cracovia-Wisła");
        totalizator.addGame(footballGame);
        
>>>>>>> 493dacd087cf3abf555620ab9f4531d42bd64d67
        Device iosdevice = new iOSDevice("iphone");
        iosdevice.chooseGame(footballGame);
        iosdevice.registerToTotalizator(totalizator);
        
        Device windowsdevice = new WindowsDevice("windowsphone");
        windowsdevice.chooseGame(footballGame);
        windowsdevice.registerToTotalizator(totalizator);
<<<<<<< HEAD

        Device blackberryDevice = new BlackberryDevice("berryphone");
        blackberryDevice.chooseGame(volleyballGame);
        blackberryDevice.registerToTotalizator(totalizator);

        Device androidDevice = new AndroidDevice("droidphone");
        androidDevice.chooseGame(volleyballGame);
        androidDevice.registerToTotalizator(totalizator);

        Device blackberryDevice2 = new BlackberryDevice("berryphone2");
        blackberryDevice2.chooseGame(volleyballGame2);
        blackberryDevice2.registerToTotalizator(totalizator);



        footballGame.updateScores("1:3");
        volleyballGame.updateScores("89:113");
=======
        
        footballGame.updateScores("1:3");

>>>>>>> 493dacd087cf3abf555620ab9f4531d42bd64d67
        

        


    }

}
