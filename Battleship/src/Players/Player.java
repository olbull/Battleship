package Players;
import Coordinate.ShotCoordinate;
import Fleet.Fleet;
import java.util.ArrayList;

public abstract class Player {
    Fleet fleet;
    ArrayList<ShotCoordinate> ShotsFired;
    // Attribute isAlive?

    public ShotCoordinate shoot(){return null;}

    public void handleShot(){}
}
