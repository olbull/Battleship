package Ships;
import Coordinate.ShipCoordinate;

public abstract class Ship {
    int length;
    char letter;
    boolean state; //implement state pattern!
    int x1; int y1; int x2; int y2;

    void placeShip(ShipCoordinate sc){
    }
}
