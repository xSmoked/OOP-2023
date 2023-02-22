package ie.tudublin;

import ddf.minim.AudioInput;
import ddf.minim.AudioPlayer;
import ddf.minim.AudioBuffer;
import ddf.minim.Minim;
import processing.core.PApplet;

public class Audio1 extends PApplet
{
	Minim minim;
	AudioInput ai;
	AudioPlayer ap;
	AudioBuffer ab;
	public void settings()
	{
		size(1024, 500);
	}

	int frameSize = 1024;

	public void setup() {
		colorMode(HSB);
		background(0);
		minim = new Minim(this);
		ai = minim.getLineIn(Minim.MONO, frameSize, 44100, 16);
		ab = ai.mix;

		smooth();
	}

	public void draw()
	{
		background(0);
		stroke(255);
		//ab.get(i) gets i'th element of the array
		float half = height / 2;
		float cgap = 255 / (float)ab.size();
		float average = 0;
		for(int i = 0; i < ab.size(); i++){
			average += abs(ab.get(i));
			
			//stroke(i * cgap, 255, 255);
			//line(i,half ,i, half + ab.get(i) * half);
		}
		average /= (float)ab.size();
		float r = average *= 10000;
		lerpedR = lerp(lerpedR, r, 0.1f);
		circle(width/2, height/2, lerpedR);
		
		fill(average,255,255);
		noStroke();
	}

	float lerpedR = 0;
}

