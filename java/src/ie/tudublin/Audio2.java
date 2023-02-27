package ie.tudublin;

import ddf.minim.AudioBuffer;
import ddf.minim.AudioInput;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import ddf.minim.analysis.FFT;
import processing.core.PApplet;


public class Audio2  extends PApplet{
    Minim m;
    AudioPlayer ap;
    AudioInput ai;
    AudioBuffer ab;
    float [] lerpBuffer = new float[1024];
    float lerpedY = 0;

    FFT fft;
   public void settings(){
       size(1024, 500);
   } 
    public void setup(){
        m = new Minim(this);
        ai = m.getLineIn(Minim.MONO, width, 44100, 16);
        ab = ai.mix;
        fft = new FFT(width, 44100);
    }
    public void draw(){
        background(0);
        stroke(255);
        colorMode(HSB);
        float half = height / 2;
        for(int i = 0; i < ab.size(); i++){
            stroke(map(i,0,ab.size(),0,255), 255, 255);
            lerpBuffer[i] = lerp(lerpBuffer[i], ab.get(i), 0.1f);
            float f = abs(lerpBuffer[i] * half * 10f);
            line(i, half + f, i, half - f);
        }

        fft.forward(ab);

        int highestIndex = 0;
        for(int i = 0; i < fft.specSize(); i++){
            stroke(map(i,0,fft.specSize(),0,255), 255, 255);
            float f = fft.getBand(i) * 10f;
            line(i*2.0f, height*2.0f, i, height - f);

            if(fft.getBand(i) > fft.getBand(highestIndex)){
                highestIndex = i;
            }
        }
        float freq = fft.indexToFreq(highestIndex);
        fill(255);
        text("Frequency: " + freq,10, 50);


        float y = map(freq, 1000f, 25000f, height, 0);
        lerpedY = lerp(lerpedY, y, 0.1f);
        circle (200, y, 50);
        circle (300, lerpedY, 50);
    }
    float map1(float a, float b, float c, float d, float e){
        return d + (((a - b) / (c - b)) * (e - d));
    }
}  
