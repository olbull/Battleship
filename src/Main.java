
import Coordinate.*;
import Players.*;

public class Main {
    public static void main(String[] args) {
        //Coordinate.ShipCoordinate myFirst = new Coordinate.ShipCoordinate(new Coordinate.HumanBehavior());
        //System.out.print(myFirst.x1 + " " + myFirst.y1 + "\n");
        //System.out.print(myFirst.x2 + " " + myFirst.y2 + "\n");

        //ShotCoordinate mySecond = new ShotCoordinate(new cpuBehavior());
        //System.out.print(mySecond.x + " " + mySecond.y);
        HumanPlayer p1 = new HumanPlayer();
        ShotCoordinate shot1 = p1.shoot();
        ShotCoordinate shot2 = p1.shoot();
    }
}