package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet {

    public void settings() {
        size(500, 500);
    }

    public void setup() {
        colorMode(HSB);
        background(0);

        x1 = random(0, width);
        x2 = 0;
        y1 = random(0, height);
        y2 = 0;

        float range = 5;

        x1dir = random(-range, range);
        x2dir = random(-range, range);
        y1dir = random(-range, range);
        y2dir = random(-range, range);

        smooth();

    }

    float x1, y1, x2, y2;
    float x1dir, x2dir, y1dir, y2dir;
    float c = 0;

    public void draw() {
        strokeWeight(10);
        stroke(c, 255, 255);
        c = (c + 1f) % 255;
        clear();

        float r = Math.abs(x2 - y2);

        circle(x1, y1, r);

        x1 += x1dir;
        x2 += x2dir;
        y1 += y1dir;
        y2 += y2dir;

        if (x1 - r < 0 || x1 + r > width) {
            x1dir = -x1dir;
        }
        if (y1 - r < 0 || y1 + r > height) {
            y1dir = -y1dir;
        }

        if (x2 < 0 || x2 > width) {
            x2dir = -x2dir;
        }
        if (y2 < 0 || y2 > height) {
            y2dir = -y2dir;
        }
    }
}
