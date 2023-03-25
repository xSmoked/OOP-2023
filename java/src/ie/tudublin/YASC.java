package ie.tudublin;

import processing.core.PApplet;

public class YASC extends PApplet
{
	Ship ship;
	public void settings()
	{
		size(500, 500);
		
	}

	public void setup() {
		colorMode(HSB);
		ship = new Ship(width/2,height/2, 70, 50, this);
		
	}

	
	
	public void draw()
	{	
		ship.render();
	}
}
