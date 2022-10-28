package Players;
import Fleet.Fleet;
import java.util.ArrayList;

import Coordinate.ShotCoordinate;


public class HumanPlayer extends Player{
    Fleet fleet;
    ArrayList<ShotCoordinate> ShotsFired;
    // Attribute isAlive?

    public HumanPlayer(){}//initialize fleet, call fleet.placeFleet
    public ShotCoordinate shoot(){return null;}
    public void handleShot(){}
    public void checkFleet(){}
}
