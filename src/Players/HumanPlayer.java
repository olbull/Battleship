package Players;
import Coordinate.HumanBehavior;
import Coordinate.InputBehavior;
import Fleet.Fleet;
import java.util.ArrayList;
import Ships.Ship;

import Coordinate.ShotCoordinate;


public class HumanPlayer extends Player{
    Fleet fleet;
    ArrayList<ShotCoordinate> ShotsFired = new ArrayList<ShotCoordinate>();
    final InputBehavior ib = new HumanBehavior();
    // Attribute isAlive?

    public HumanPlayer(){}//initialize fleet, call fleet.placeFleet
    public ShotCoordinate shoot(){ // returns object of type ShotCoordinate with coordinates in grid after adding it to ShotsFired
        ShotCoordinate shot = new ShotCoordinate(this.ib);
        ShotsFired.add(shot);
        return shot;
    }

    public void handleShot(){}
    public void checkFleet(){};
}
