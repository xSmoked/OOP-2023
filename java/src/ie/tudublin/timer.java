package ie.tudublin;

import java.lang.*;

public class timer {
    long startTime = 0, stopTime = 0;
    boolean running = false;  
  
    
    void start() {
        startTime = System.currentTimeMillis();
        running = true;
    }
    void stop() {
        stopTime = System.currentTimeMillis();
        running = false;
    }
    long getElapsedTime() {
        long elapsed;
        if (running) {
             elapsed = (System.currentTimeMillis() - startTime);
        }
        else {
            elapsed = (stopTime - startTime);
        }
        return elapsed;
    }
    long getSeconds() {
      return (getElapsedTime() / 1000);
    }
}

