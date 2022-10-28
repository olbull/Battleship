package Players;
import Coordinate.InputBehavior;
import Coordinate.cpuBehavior;
import Fleet.Fleet;
import java.util.ArrayList;
import Coordinate.ShotCoordinate;


public class cpuPlayer {
    Fleet fleet;
    ArrayList<ShotCoordinate> ShotsFired = new ArrayList<ShotCoordinate>();
    final InputBehavior ib = new cpuBehavior();
    // Attribute isAlive?

    public cpuPlayer(){}//initialize fleet, call fleet.placeFleet
    public void handleShot(){}
    public void checkFleet(){}
}
