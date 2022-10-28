package Grids;
import Coordinate.ShipCoordinate;
import java.util.ArrayList;

public class TargetGrid extends Grid {

    String[][] gridStructure = new String[10][10];
    //private ArrayList<ShipCoordinate> ships; //oder besser als zweites, bereits platziertes Array?

    protected void printHeader(){
        System.out.println("====== TARGET GRID ======");
    }
}
