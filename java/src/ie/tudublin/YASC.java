package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PVector;

public class YASC extends PApplet
{
	Ship ship;
	Ship ship1;
	AIShip enemyShip;

	ArrayList<PVector> pathPostionList = new ArrayList<PVector>();

	public void settings()
	{
		size(500, 500);
		
	}

	public void setup() {
		ship = new Ship(width / 2, height / 2, 50, 70, this);
		ship1 = new Ship(100, 50, 80, 6, this);
		enemyShip = new AIShip(width / 2, height / 2, 50, 6, this);
		colorMode(HSB);

		pathPostionList.add(new PVector(100, 100));
		pathPostionList.add(new PVector(200, 100));
		pathPostionList.add(new PVector(200, 200));
		enemyShip.setPath(pathPostionList);
	}

	public void draw()
	{	background(0);
		ship.render();
		ship.move();

		enemyShip.render();
		enemyShip.move();
	}
}
