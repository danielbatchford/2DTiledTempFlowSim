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

    public void mousePressed() {
        Tile target = tileController.getTiles()[mouseX * DIVS[0] / WIDTH][mouseY * DIVS[1] / HEIGHT];
        if (target.isLocked()){
            target.unlock();
        }
        else {
            target.setTempHighOrLow(mouseButton == LEFT);
        }
    }

    public void keyPressed() {
        switch (key){
            case 'p':
            if (paused) {
                loop();
            } else {
                noLoop();
            }
            paused = !paused;
            break;
            case 'r':
                tileController = new TileController(this);
                break;
            default:
                break;
        }

    }
}
