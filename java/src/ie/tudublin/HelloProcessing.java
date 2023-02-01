package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
			//colorMode(HSB);
			background(255, 0 ,0);
	}
	public void draw()
	{	
		noStroke();
		fill(255,255,0);
		circle(250, 250, 400);
		fill(0,100,255);
		triangle(250 ,0, 50, 400, 450, 400);
		fill(255);
		ellipse(250, 200, 150, 100);
		fill(0);
		circle(250,200, 50);	
	}
}
