package ie.tudublin;

import processing.core.PApplet;
import processing.data.TableRow;

public class Star {
    private boolean hab;
    private String displayName;
    private float distance;
    private float xG;
    private float yG;
    private float zG;
    private float absMag;

    public Star(TableRow row) {
        /* 
        this.hab = row.getInt("Hab?") == 1;
        this.displayName = row.getString("Display Name");
        this.distance = row.getFloat("Distance");
        this.xG = row.getFloat("Xg");
        this.yG = row.getFloat("Yg");
        this.zG = row.getFloat("Zg");
        this.absMag = row.getFloat("AbsMag");
        */
        this(row.getInt("Hab?") == 1, 
        row.getString("Display Name"), 
        row.getFloat("Xg"), 
        row.getFloat("Yg"), 
        row.getFloat("Zg"), 
        row.getFloat("AbsMag"),
        row.getFloat("Distance"));
    }
    
    public Star(boolean hab, String displayName, float distance, float xG, float yG, float zG, float absMag) {
        this.hab = hab;
        this.displayName = displayName;
        this.distance = distance;
        this.xG = xG;
        this.yG = yG;
        this.zG = zG;
        this.absMag = absMag;
    }

    public boolean isHab() {
        return hab;
    }

    public void setHab(boolean hab) {
        this.hab = hab;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public float getxG() {
        return xG;
    }

    public void setxG(float xG) {
        this.xG = xG;
    }

    public float getyG() {
        return yG;
    }

    public void setyG(float yG) {
        this.yG = yG;
    }

    public float getzG() {
        return zG;
    }

    public void setzG(float zG) {
        this.zG = zG;
    }

    public float getAbsMag() {
        return absMag;
    }

    public void setAbsMag(float absMag) {
        this.absMag = absMag;
    }

    @Override
    public String toString() {
        return "Star [hab=" + hab + ", displayName=" + displayName + ", distance=" + distance + ", xG=" + xG + ", yG="
                + yG + ", zG=" + zG + ", absMag=" + absMag + "]";
    }

    public void render(PApplet P) {
        float border = P.width * 0.1f;
        float x = PApplet.map(xG, -5, 5, border, P.width - border);
        float y = PApplet.map(yG, -5, 5, border, P.height - border);

        P.stroke(255,255,0);
        P.line(x,y-5, x, y+5);
        P.line(x-5,y, x+5, y);
        P.stroke(255,0,0);
        P.circle(x,y,absMag);
        P.fill(255);
        P.textAlign(PApplet.LEFT, PApplet.RIGHT);
        P.textSize(12);
        P.text(displayName, x+20, y);
        P.noFill();



    }
}

