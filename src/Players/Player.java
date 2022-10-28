package Players;
import Coordinate.InputBehavior;
import Coordinate.ShotCoordinate;
import Fleet.Fleet;
import java.util.ArrayList;

public abstract class Player {
    Fleet fleet;
    ArrayList<ShotCoordinate> ShotsFired;
    // Attribute isAlive?
    InputBehavior ib;


    public ShotCoordinate shoot(){ // returns object of type ShotCoordinate with coordinates in grid after adding it to ShotsFired
        ShotCoordinate shot = new ShotCoordinate(this.ib);
        ShotsFired.add(shot);
        return shot;
    }

    public abstract void handleShot();
}
