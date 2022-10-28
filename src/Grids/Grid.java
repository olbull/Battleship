package Grids;
import java.util.ArrayList;
import Coordinate.ShipCoordinate;

public abstract class Grid {
    char[][] gridStructure = new char[10][10];
    private ArrayList<ShipCoordinate> ships; //oder besser als zweites, bereits platziertes Array?

    public void draw(){};
    public void editGrid(){};
}
