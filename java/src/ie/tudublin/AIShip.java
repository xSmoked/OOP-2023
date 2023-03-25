package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PVector;

public class AIShip  extends  Ship {
    
    ArrayList<PVector> pathPostionList = new ArrayList<PVector>();
    int pathIndex = 0;
    PVector target;

    public AIShip(float x, float y, float size, int c, PApplet p) {
        super(x, y, size, c, p);
    }

    public void setPath(ArrayList<PVector> pathPostionList) {
        this.pathPostionList = pathPostionList;
    }

    public void move() {
        if (pathPostionList.size() > 0) {
            PVector pos = super.getPos();
            target = pathPostionList.get(pathIndex);
            PVector dir = PVector.sub(target, pos);
            dir.normalize();
            pos.add(dir);
            super.setPos(pos);
            pathIndex++;
        }
        if (pathIndex >= pathPostionList.size()) {
            pathIndex = 0;
        }
    }
    
}
