package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class StarMap extends PApplet
{
	ArrayList<Star> stars = new ArrayList<Star>();

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(RGB);
		background(0);
		
		smooth();

		loadStars();
		printStars();
	}

	public void drawGrid()
	{
		stroke(255);
		float border = 50.0f;

		    
		for(int i = -5 ; i <= 5 ; i++)
		{
			float x = map(i, -5, 5, border, width - border);
			line(x, border, x, height - border);
			line(border, x, width - border, x);
			
			textAlign(CENTER, CENTER);
			text(i, x, border * 0.5f);
			text(i, border * 0.5f, x);
		}


	}
	
	void loadStars()
	{
		Table table = loadTable("HabHYG15ly.csv", "header");
		for(TableRow r:table.rows())
		{
			Star s = new Star(r);
			stars.add(s);
		}
	}


	float  Map(float a, float b, float c, float d, float e)
	{
		return d + (e - d) * ((a - b) / (c - b));
	}
	
	void printStars()
	{
		for(Star s:stars)
		{
			System.out.println(s.toString());
		}
	}
	void displayStars()
	{
		for(Star s:stars)
		{
			s.render(this);
		}
	}
	public void draw()
	{	
		strokeWeight(1);		

		drawGrid();
		displayStars();
	}
}
