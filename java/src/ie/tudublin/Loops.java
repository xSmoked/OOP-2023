package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet {

	int mode = 0;
	public void settings() {
		size(400, 400);
	}

	public void setup() {
	}



	public void keyPressed() {
		
		mode = key - '0';
		println(mode);
	}

	public void draw() {
		background(0);
		fill(255);
		
		switch(mode){
			case 0:
				if(mouseX < width/4){
					rect(0, 0, width/4, height);
				}
				else if(mouseX > width/4 && mouseX < width/2){
					rect(width/4, 0, width/4, height);
				}
				else if(mouseX > width/2 && mouseX < width/4*3){
					rect(width/2, 0, width/4, height);
				}
				else if(mouseX > width/4*3){
					rect(width/4*3, 0, width/4, height);
				}
				break;
			case 1:
				if(mouseY < height/2){
					if(mouseX < width/4){
						rect(0, 0, width/4, height/2);
					}
					else if(mouseX > width/4 && mouseX < width/2){
						rect(width/4, 0, width/4, height/2);
					}
					else if(mouseX > width/2 && mouseX < width/4*3){
						rect(width/2, 0, width/4, height/2);
					}
					else if(mouseX > width/4*3){
						rect(width/4*3, 0, width/4, height/2);
					}

				}
				else if(mouseY > height/2){
					if(mouseX < width/4){
						rect(0, height/2, width/4, height/2);
					}
					else if(mouseX > width/4 && mouseX < width/2){
						rect(width/4, height/2, width/4, height/2);
					}
					else if(mouseX > width/2 && mouseX < width/4*3){
						rect(width/2, height/2, width/4, height/2);
					}
					else if(mouseX > width/4*3){
						rect(width/4*3, height/2, width/4, height/2);
					}
				}
				break;
			case 2:
				
				if(mouseX > width/4 && mouseX < width/4*3 && mouseY > height/4 && mouseY < height/4*3){
					rect(width/4, height/4, width/2, height/2);
					fill(255, 0, 0);
				}
				else {
					rect(width/4, height/4, width/2, height/2);
					fill(0,0,255);
				}
				break;
			case 3:
				noStroke();
				colorMode(HSB);
				for(int i = 0; i < 10; i++){
					rect(i * 40, 0, 40, height);
					fill(i*25, 255, 255);
				}
				break;
			case 4:
				noStroke();
				colorMode(HSB);
				for(int i = 0; i < 10; i++){
					
						rect(i * 40, i * 40, 40, 40);
						fill(i*25, 200, 255);
		
				}
				break;
			case 5:
				noStroke();
				colorMode(HSB);
				for(int i = 0; i < 10; i++){
					rect(i * 40, i * 40, 40, 40);
					fill(i*25.5f, 200, 255);

					rect((i*40), (height - 40) - (i * 40) ,40, 40);
					fill(255 - (i*25.5f), 200, 255);
				}
				break;

			case 6:
				noStroke();
				colorMode(HSB);
				for(int i = 10; i > 0; i--){
					circle(width/2, height/2, i*20);
					fill(i*25.5f, 127.5f, 127.5f);
				}

				break;
			case 7:
				noStroke();
				colorMode(HSB, 360, 100, 100);
				for(int i = 0; i < 10; i++){
					circle(20+ i*40, 40, 40);
					fill(i*24, 100, 75);
				}
				break;
			case 8:
				noStroke();
				colorMode(HSB, 360, 100, 100);
				for(int i = 0; i < 10; i++){
					for(int j = 0; j < 10; j++){
						circle(20+ i*40, 20 + j*40, 40);
						fill(((i*12f) + (j*12f)), 100, 75);
					}
				}
				break;
			case 9:
				int x = -5;
				for(int i = 1; i < 12; i++){
					fill(255);
					text(x, 10f + (i * 32f), 10);

					fill(255);
					line(10f + (i * 32f), 10, 10f + (i * 32f), height - 10f);
					
					fill(255);
					text(x, 10, 10f + (i * 32f));

					fill(255);
					line(10, 10f + (i * 32f), width - 10f, 10f + (i * 32f));
					x++;
				}
				break;
			
			case 65: //Key Q
				noStroke();

  				int squareSize = width / 20;
  
					for (int i = 0; i < height; i += squareSize) {
						for (int j = 0; j < width; j += squareSize) {
						if (((j / squareSize) + (i / squareSize)) % 2 == 0) {
							fill(0, 0, 240);
						} else {
							fill(0, 0, 255);
						}
						rect(j, i, squareSize, squareSize);
						}
					}
				break;
		}
	}
}
