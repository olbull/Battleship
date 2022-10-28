package Coordinate;

import java.util.ArrayList;
public class ShotCoordinate extends Coordinate {

    public final int x; public final int y;
    InputBehavior ib;

    public ShotCoordinate(InputBehavior injectedBehavior){
        ib = injectedBehavior;
        ArrayList<Integer> coordinates = ib.generateShotCoordinate();
        x = coordinates.get(0);
        y = coordinates.get(1);
    }
}
