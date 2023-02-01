package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet
{

	
	public void settings()
	{
		size(500, 500);
	}
	float playerX, playerY;
	float playerWidth = 50;
	float playerHalfWidth = playerWidth / 2;

	float bugX, bugY, bugWidth = 30;
	float halfBugWidth = bugWidth / 2;

	public void setup() {
		colorMode(HSB);
		reset();
		
		
	}
	
	public void draw()
	{	
		background(0);
		playerX = mouseX;
		drawPlayer(playerX, playerY, 40);
		drawBug(bugX, bugY++);

	}

	

	void drawPlayer(float x, float y, float w){
		stroke(255);
		float playerHeight = w / 2;
		float playerHalfWidth = w / 2;
		line(x - playerHalfWidth, y + playerHeight, x + playerHalfWidth, y + playerHeight);
		line(x - playerHalfWidth, y + playerHeight, x, y);
		line(x + playerHalfWidth, y + playerHeight, x, y);
		line(x - playerHalfWidth, y + playerHeight * 0.5f, x - (playerHalfWidth * 0.8f), y + playerHeight * 0.3f);
		line(x + playerHalfWidth, y + playerHeight * 0.5f, x + (playerHalfWidth * 0.8f), y + playerHeight * 0.3f);

		line(x - (playerHalfWidth * 0.8f), y + playerHeight * 0.3f, x + (playerHalfWidth * 0.8f),
				y + playerHeight * 0.3f);

		line(x, y, x, y - playerHeight);
	}

	void drawBug(float x, float y){
		// Draw the bug
		stroke(255);
		float saucerHeight = bugWidth * 0.7f;
		line(x, y - saucerHeight, x - halfBugWidth, y);
		line(x, y - saucerHeight, x + halfBugWidth, y);
		// line(x - halfBugWidth, y, x - halfBugWidth, y);
		line(x - halfBugWidth, y, x + halfBugWidth, y);
		float feet = bugWidth * 0.1f;
		line(x - feet, y, x - halfBugWidth, y + halfBugWidth);
		line(x + feet, y, x + halfBugWidth, y + halfBugWidth);

		feet = bugWidth * 0.3f;
		line(x - feet, y, x - halfBugWidth, y + halfBugWidth);
		line(x + feet, y, x + halfBugWidth, y + halfBugWidth);

		float eyes = bugWidth * 0.1f;
		line(x - eyes, y - eyes, x - eyes, y - eyes * 2f);
		line(x + eyes, y - eyes, x + eyes, y - eyes * 2f);
	}

	private void reset(){
		resetBug();
		playerX = width / 2;
		playerY = height - 50;
	}

	void resetBug(){
		bugX = random(halfBugWidth, width - halfBugWidth);
		bugY = 50;
	}

	public void keyPressed(){
		if (key == ' '){
			line(playerX, playerY, playerX, 100);
			if (playerX > bugX - halfBugWidth && playerX < bugX + halfBugWidth){
				resetBug();
			}

		}
	}
}
