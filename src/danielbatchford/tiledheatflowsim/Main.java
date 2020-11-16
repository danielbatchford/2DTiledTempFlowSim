package danielbatchford.tiledheatflowsim;

import processing.core.PApplet;

public class Main extends PApplet implements Constants {


    boolean paused;

    TileController tileController;

    public static void main(String[] args) {
        PApplet.main("danielbatchford.tiledheatflowsim.Main");
    }

    public void draw() {
        background(255);
        tileController.update();

        tileController.draw();
    }

    public void setup() {

        paused = false;

        frameRate(FRAME_RATE);
        surface.setTitle(WINDOW_TITLE);

        noStroke();

        tileController = new TileController(this);
    }

    public void settings() {
        size(WIDTH, HEIGHT);
        noSmooth();
    }

    public void mousePressed(){
        tileController.getTiles()[mouseX * DIVS[0] / WIDTH][mouseY * DIVS[1]/ HEIGHT].toggleBlocked();
    }

    public void keyPressed() {
        if (key == 'p') {
            if (paused) {
                loop();
            } else {
                noLoop();
            }
            paused = !paused;
        }
    }
}
