package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class Ship {
    private PVector pos;
    PApplet p;
    private float rot;
    private int c;
    private float size;

    public Ship(float x, float y, int c, float size, PApplet p) {
        pos = new PVector(x,y);
        this.c = c;
        this.size = size;
        this.p = p;
    }

    public void render() {
        p.stroke(c,255,255);
        p.line()
    }

    public PVector getPos() {
        return pos;
    }
    public void setPos(PVector pos) {
        this.pos = pos;
    }
    public float getRot() {
        return rot;
    }
    public void setRot(float rot) {
        this.rot = rot;
    }
    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }
    public float getSize() {
        return size;
    }
    public void setSize(float size) {
        this.size = size;
    }

    
}
